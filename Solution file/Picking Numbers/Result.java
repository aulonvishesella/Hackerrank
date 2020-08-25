package Solution;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
    // Write your code here
   int temp =0;
   int count =0;
    for(int i=0;i<a.size();i++){
         for(int j=0; j<a.size();j++){
             if(a.get(i) - a.get(j)==1 || a.get(i) - a.get(j) == 0 ){
                 temp++;
             }
         }
         if(temp> count){
             count = temp;
             temp=0;
         }
         else{
             temp=0;
         }  
    } 
    return count;
    }

}
