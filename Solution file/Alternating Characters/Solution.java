import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    //o(n) time complexity
    static int alternatingCharacters(String s) {
        int numberDeletions = 0;
        int i=0;
        while(i+1<=s.length()-1){
        	//if char at index i is equal to the next char, then we have to add to the number of deletions 
            if(s.charAt(i)== s.charAt(i+1)){
                numberDeletions+=1;
                i++;
            }
            else{
                i++;
            }
        }
        return numberDeletions;
    }
   
}