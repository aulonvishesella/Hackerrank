package Solution;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int count =0;
        boolean chaotic= false;
        for(int i=0;i<q.length;i++){
            //if the current element has moved more than two positions from initial index
            //then we stop the whole loop
            if (q[i] - (i + 1) > 2) {
                chaotic=true;
                break;
            }
            else{
                //we see how many moves it has made (up to 2 moves max)
                for(int j=Math.max(0,q[i]-2);j<i;j++){
                    if(q[j] > q[i]){
                        count++;
                    }
                }
            }
        }
        if(chaotic==true){
            System.out.println("Too chaotic");
        }
        else{
            System.out.println(count);
        }

    }
