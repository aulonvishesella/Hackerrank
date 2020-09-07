package Solution;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the superReducedString function below.
    static String superReducedString(String s) {
        int i=1;
        while(i<s.length()){
            if(s.charAt(i) == s.charAt(i-1)){
                if(s.length() == 2){
                         s= "";
                }               
                else{
                     if(i==1){
                        s= s.substring(i+1);
                        i=0;
                    }       
                    else{
                        s= s.substring(0,i-1) + s.substring(i+1);
                        i=i-2;
                    }
                }
            }
                i++;            
        }

        if(s.length() == 0){
            return "Empty String";
        }
        else{
            return s;
        }

    }
