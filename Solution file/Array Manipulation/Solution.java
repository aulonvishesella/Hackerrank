import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//O(n) time complexity
public class Solution {
    static long arrayManipulation(int n, int[][] queries) {
    	long[] arrayToBeManipulated = new long[n+1];
        //retrieve number of columns
        int numberOfCycle = queries.length;
        int cycleCounter=0;
        long sum=0;
        long max=0;        
        while(cycleCounter<numberOfCycle){
            int i=queries[cycleCounter][0]-1;
            int j=queries[cycleCounter][1];
            arrayToBeManipulated[i]+=queries[cycleCounter][2];
            arrayToBeManipulated[j]-=queries[cycleCounter][2];   
            cycleCounter++;
        }
        //find the largest value from the array
        for(int i =0;i<n;i++){
            sum+=arrayToBeManipulated[i];
            if(max<sum){
                max=sum;
            }
        }
        return max;

    }