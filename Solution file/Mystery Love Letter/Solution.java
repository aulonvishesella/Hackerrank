import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the theLoveLetterMystery function below.
    static int theLoveLetterMystery(String s) {
        int count = 0;
        int n = s.length();
        //we loop through until index i is less than the floor value of half of the size of the string
        for(int i=0;i<Math.floor(n/2);i++){
            if(s.charAt(i) != s.charAt((n-1)-i)){
                int firstChar = s.charAt(i);
                int secondChar = s.charAt((n-1)-i);
                count+= Math.abs(firstChar-secondChar);
            }
                
        }
        return count;

    }