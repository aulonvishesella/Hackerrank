import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


//O(n) time complexity
public class Solution {
    
    static int makeAnagram(String first, String second) {  
        
        //hashmap of the characters with the occurence of the character in the strings
        Map<Character, Integer> characterCount = new HashMap<>();
        
        //loop through the first string. If the current character is not in the map, add it with 1, else we increment the value count of the character
        for(int i=0;i<first.length();i++){
            char c = first.charAt(i);
            
            if(characterCount.containsKey(c)){
               characterCount.put(c, characterCount.get(c)+1);
            }
            
            else{
            characterCount.put(c, 1);
            }

        }
         
         //loop through the second string. If the current character is not in the map, add 0, else we decrement the value count of the character
        for(int i=0;i<second.length();i++){
            char c = second.charAt(i);
            
            if(characterCount.containsKey(c)){
               characterCount.put(c, characterCount.get(c)-1);
            }
            
            else{
            characterCount.put(c, -1);
            }

        }
        
        //loop through each value from all values in the map. Add the values to count. (if there is an equal pair, the no need to add anything as there is an anagram.
        //else, we have to add the value to the count
        int count = 0;
        for( Integer value : characterCount.values()) {
            if(value!=0){
                count+= Math.abs(value);
            }
        }
        return count;
           
    }
