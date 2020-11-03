import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String first, String second) {  
        
        Map<Character, Integer> characterCount = new HashMap<>();
        
        for(int i=0;i<first.length();i++){
            char c = first.charAt(i);
            
            if(characterCount.containsKey(c)){
               characterCount.put(c, characterCount.get(c)+1);
            }
            
            else{
            characterCount.put(c, 1);
            }

        }
         
        for(int i=0;i<second.length();i++){
            char c = second.charAt(i);
            
            if(characterCount.containsKey(c)){
               characterCount.put(c, characterCount.get(c)-1);
            }
            
            else{
            characterCount.put(c, -1);
            }

        }
     
        int count = 0;
        for( Integer value : characterCount.values()) {
            if(value!=0){
                count+= Math.abs(value);
            }
        }
        return count;
           
    }