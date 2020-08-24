package Solution;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        int counter = 0;
        int max = ar[0];
        
        for(int i=0;i<ar.length;i++){
            //if current value is greater than max, then we have found our new max 
            //set counter to 1
            if(ar[i]>max){
                max=ar[i];
                counter= 1;
            }
            //increase counter if current value equal to max 
            else if(ar[i]==max){
                counter++;
            }
        }

        
        return counter;

    }
}