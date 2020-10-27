import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static long largestRectangle(int[] h) {
            //stack to maintain largest surface
    		Stack<Integer> stack = new Stack();
    		 int count=0;
            for(int i=0;i<h.length;i++){
               //go through the building towards the left. If the height of the buildings are greater or equal to the current
                //building, then we add the count
                for(int j=i;j>=0;j--){
                    if(h[i]<=h[j]){
                        count++;
                    }
                    else{
                        break;
                    }
                }
                //go through the building towards the right. If the height of the buildings are greater or equal to the current
                //building, then we add the count
                for(int x=i+1;x<h.length;x++){
                    if(h[i]<=h[x]){
                        count++;
                    }
                    else{
                        break;
                    }
                }
                //calculate the total area by multiplying the height of our current building by the max between 1 and
                //count
                int totalArea = h[i] * Math.max(count, 1);
                //if stack is empty, then that total area is pushed straight onto the stack
                if(stack.isEmpty()){
                    stack.push(totalArea);
                }
                //we compare the area on the stack with the current area calculated. We push onto the stack the larger area
                else{
                    int temp = stack.pop();
                    stack.push(Math.max(temp,totalArea));
                }
                count=0;
            }
            //we return the only value in the stack as that is the largest area calculated
            long number = stack.pop();
            return number;
    }
