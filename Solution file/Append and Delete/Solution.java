package Solution;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//o(n) time complexity
public class Solution {

    // Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {
        int count =0;
        int lengthRemainings1 = s.length();
        int lengthRemainings2 = t.length();
        int i=0;
            while(lengthRemainings1>0 && lengthRemainings2>0){
                //if the characters the same, increase count
                if(s.charAt(i) == t.charAt(i)){
                    count+=1;
                    //reduce length remaining to count from
                    lengthRemainings1--;
                    lengthRemainings2--;
                }
                else{
                    break;
                }
                i++;
            }

            if(s.length()>k){
                if((Math.abs(s.length()-count) + Math.abs(t.length()-count)) <=k){
                    return "Yes";
                }
                else{
                    return "No";
                }
            }
            else{
                if(s.length()+t.length()<=k ){
                    return "Yes";
                }
                else{
                    return "No";
                }
            }
    }
}
    