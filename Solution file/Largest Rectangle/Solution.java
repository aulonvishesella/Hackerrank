import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    /*
    Explanation of my solution
        1. Create a stack to maintain the largest rectangle area
        2. loop through each building
        3. If you join  adjacent buildings, they will form a solid rectangle of area. Therefore, we count buildings:
            3.a. to its left that have a greater or equal height. Else, we break.
            3.b. to its right that have a greater or equal height. Else, we break.
            
        NOTE: the 'count' in this case is the length that can be constructed within the boundaries for the given building
            
        4. Calculate the area of the solid rectangle by multiplying the height of the given building with the larger length (1 or count) 
        5. Then we want to push this area on the stack. 
             5.a. Check if stack is empty. If it is, we push straight onto stack. Else, we compare the area on the stack with the current area calculated.
                   We push onto the stack the larger area
        6. Return the only value in the stack as that is the largest area calculated       
    */
   
    static long largestRectangle(int[] h) {
    	
            Stack<Integer> stack = new Stack();
    	    int count=0;
            for(int i=0;i<h.length;i++){
                for(int j=i;j>=0;j--){
                    if(h[i]<=h[j]){
                        count++;
                    }
                    else{
                        break;
                    }
                }
                for(int x=i+1;x<h.length;x++){
                    if(h[i]<=h[x]){
                        count++;
                    }
                    else{
                        break;
                    }
                }
                
                int totalArea = h[i] * Math.max(count, 1);
                if(stack.isEmpty()){
                    stack.push(totalArea);
                }
               
                else{
                    int temp = stack.pop();
                    stack.push(Math.max(temp,totalArea));
                }
                count=0;
            }
            long number = stack.pop();
            return number;
    }
