import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // O(n) time complexity
    static int beautifulBinaryString(String b) {
        //count to keep track of the number of "010" substrings found 
        int count = 0;
        int i=0;
        while(i+2<=b.length()-1){
            //if the substring 010 is found, increase count and set index i to skip three places
            if(b.substring(i,i+3).equals("010")){
                count++;
                i+=3;
            }
            else{
                i++;
            }
        }
        return count;

    }