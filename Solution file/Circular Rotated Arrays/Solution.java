package Solution;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Time complexity = O(n)
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
         //array that contains elements after all rotations
         int []rotatedA = new int[a.length]; 

         for(int i=0;i<a.length;i++){
        	 
             //Final circular rotated pos found from adding current index with the number of rotations needed
             //we mod it with the length in case it goes out of bounds
             int rotatedPos=(i+k) % a.length;
             rotatedA[rotatedPos] = a[i];  
         }

     
        int[] qu = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            qu[i] = rotatedA[queries[i]];
        }
        return qu;
    }
}