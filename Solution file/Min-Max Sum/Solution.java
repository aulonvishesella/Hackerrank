package Solution;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // O(n) time complexity
    static void miniMaxSum(int[] arr) {
            long min = arr[0];
            long max = arr[0];
            long sum=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
                if(arr[i]<min){
                    min=arr[i];
                }
                sum+=arr[i];
            }          
            long minSum = sum-max;
            long maxSum = sum-min;
            System.out.print(minSum + " " + maxSum);  

    }
}
