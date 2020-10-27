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
        3. for each building
            3.a. count the buildings on its left. If the height of the buildings are greater or equal to the current
                 building, then we add the count. Else, we break.
            3.b. repeat the same for the buildings on its right.
            
        NOTE: the 'count' in this case is the length that can be constructed within the boundaries for the given building
            
        4. Then we calculate the area of the rectangle by multiplying the height of its building with the max value between two lengths: 1 or count value 
        5. If stack is empty, we push onto stack. Else, we compare the area on the stack with the current area calculated. We push onto the stack the larger area
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
