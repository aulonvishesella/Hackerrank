package Solution;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
    	//counter to count how many # required for each level
        int counter =1;
        for(int i=0;i<n;i++){
            for(int x=0;x<n;x++){
                if(x+counter>n-1){
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
            //increase counter so next level has 1 more #
            counter++;
        }

    }
}