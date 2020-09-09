import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//O(n) time complexity
public class Solution {
    static String fairRations(int[] B) {
        int sum=0;
        int count=0;
        for(int i=0;i<B.length;i++){
            sum+=B[i];
        }
        //if the sum of the value is odd, then we will never recieve even loafs
        if(sum%2!=0){
           return "NO";
        }
        else{
            for(int i = 0; i<B.length; i++){
                //if the current loaf value is odd, then change that and the loaf infront
                //to even
                if(B[i] % 2 != 0){
                    B[i] = B[i] + 1;
                    B[i+1] = B[i+1] + 1;
                    count+=2;
                 }
            }
            String countValue = Integer.toString(count);
            return countValue;
        }        
    }