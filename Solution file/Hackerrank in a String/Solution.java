package Solution;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//O(n^2) time complexity
public class Solution {
    static String hackerrankInString(String s) {
        String hackerrank = "hackerrank";
        int count=0;
        int j=0;
        for(int i=0;i<hackerrank.length();i++){
            while(j<s.length()){
                if(hackerrank.charAt(i) == s.charAt(j)){
                   count++;
                   j++;
                   break;
                }
                j++;  
            }
        }
        if(count==hackerrank.length()){
            return "YES";
        }
        else{
            return "NO";
        }
    }