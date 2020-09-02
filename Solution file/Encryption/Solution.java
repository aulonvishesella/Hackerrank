package Solution;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// O(n^2) time complexity
public class Solution {
    static String encryption(String s) {
        double squareRootTextLength = Math.sqrt(s.length());
        int row = (int)Math.floor(squareRootTextLength); 
        int column = (int)Math.ceil(squareRootTextLength);
        //if row*col is less than text length, then row becomes same as column
        if(row*column<s.length()){
            row=column;
        }
        String encodedString = "";
        int counter=0;
        while(counter<column){
            int currentIndex=counter;
            for(int i=0;i<=row;i++){
                //prevent going out of bounds
                if(currentIndex<s.length()){
                    //add to the encoded string the character retrieved from current index at the string s
                    encodedString+=s.charAt(currentIndex);
                    currentIndex+=column;
                }
                else{
                    //if out of bounds and no character at that position, add nothing
                     encodedString+="";
                }       
            }
            counter++;
            //add space at the end of each counter iteration
            encodedString+= " ";
        }
        return encodedString;
    }
}
