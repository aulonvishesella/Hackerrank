import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//O(n) time complexity
public class Solution {
    static String twoStrings(String s1, String s2) {
        int count=0;
        HashMap<Character, Integer> listOfCharacters = new HashMap<Character, Integer>();
        //if substring within the first string is not added yet in the hashmap, we add it
        for(int i=0;i<s1.length();i++){
            if(!listOfCharacters.containsKey(s1.charAt(i))){
                listOfCharacters.put(s1.charAt(i), 1);
            }
        }
        //go through the second string and see if the current character is inside our hashmap
        //if it is, we can just break the loop as we are done
        for (int y = 0; y < s2.length(); y++) {
            if (listOfCharacters.containsKey(s2.charAt(y)))
            {
                count++;
                break;
            }
        }
        //we know if count>0 then the strings share a common substring so we return YES
        //else we return no
        if(count>0){
            return "YES";
        }
        else{
            return "NO";
        }
    }