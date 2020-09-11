import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


// time complxity O(n^2)
public class Solution {
    static int hourglassSum(int[][] arr) {
        int sum =0;
        //maxSum starts at -63 as that is the lowest sum we can have
        int maxSum=-63;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                //the top half of the hourglass
                sum+=arr[i][j] + arr[i][j+1] + arr[i][j+2];
                //middle of the hourglass 
                sum+=arr[i+1][j+1];
                //bottom of the hourglass
                sum+=arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]; 
                //compare againts max sum
                if(maxSum<sum){
                    maxSum=sum;
                }
                //set sum back to zero after
                sum=0;
            }
        }
        return maxSum;
    }