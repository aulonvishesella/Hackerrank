package Solution;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the acmTeam function below.
    static int[] acmTeam(String[] topic) {
        int[] output = new int[2];
        int max=0;
        int counterOfMax=1;
        int counter=0;
        //brute force to compare each set of strings with eachother
        for(int i=0;i<topic.length;i++){
            for(int j=i+1;j<topic.length;j++){
                //loop through the individual characters to compare until we reach end of string
                for(int x=0;x<topic[i].length();x++){
                    String st1= topic[i];
                    String st2 = topic[j];
                    int z = Character.getNumericValue(st1.charAt(x));
                    int y = Character.getNumericValue(st2.charAt(x));
                    //if either are 1 (or both) at current index x, it will add 1 to counter
                    if(z==1 || y==1){
                        counter+=1;
                    }
                }
            //if the max is equal to the counter we increase counter of max
            if(max==counter){
                counterOfMax++;
            }
            //else we set max to that current max
            if(max<counter){
                max=counter;
                counterOfMax=1;
            }
            counter=0;
            }
        }
        output[0]=max;
        output[1] = counterOfMax;
        return output;
    }

}