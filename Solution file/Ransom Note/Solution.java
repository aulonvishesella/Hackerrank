import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// O(n) time complexity
public class Solution {
    
    static void checkMagazine(String[] magazine, String[] note) {
        Map<String,Integer> magMap = new HashMap<>();       
        String isValid="Yes";
        
        //add each word in the magazine into a hashmap
        for(int i=0;i<magazine.length;i++){
            if(!magMap.containsKey(magazine[i])){
                magMap.put(magazine[i],1);
            }else{
                magMap.put(magazine[i],magMap.get(magazine[i])+1);
            }
        }
         //check if each string in the ransom note is in the magazine map
         //if the map does not contain the string or the value of the string inside the magazine map is less than or equal to 0, then we break
        for(int i=0;i<note.length;i++){
            if(!magMap.containsKey(note[i])){
                isValid="No";
                break;
            }else{
                if(magMap.get(note[i])==0){
                    isValid="No";
                    break;
                }
                else{
                    magMap.put(note[i],magMap.get(note[i])-1);
                }
            }
        }
        
        System.out.print(isValid);
        
    }
