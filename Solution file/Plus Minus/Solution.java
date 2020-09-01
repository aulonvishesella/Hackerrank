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
    static void plusMinus(int[] arr) {
        
        float pNum = 0;
        float nNum = 0;
        float zNum = 0;
        //format to 5 decimal places
        DecimalFormat df = new DecimalFormat("#.######");
 
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                nNum+=1;
            }
            else if(arr[i]>0){
                pNum += 1;
            }
            else{
                zNum+=1;
            }
        }

        

        System.out.println(df.format(pNum/arr.length));
        System.out.println(df.format(nNum/arr.length));
        System.out.println(df.format(zNum/arr.length));

    }
}
