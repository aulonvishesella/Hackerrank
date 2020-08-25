package Solution;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
    	//hashmap that has a key (which is the element), and a value(which is the frequency of the element)
       Map<Integer,Integer> hm = new HashMap();

       //for each int inside the array
        for(Integer x:arr){
         //if the hash map does not contain that key element, then we add it and set counter as 1
         if(!hm.containsKey(x)){
            hm.put(x,1);
         } 
         //else we increase counter for that element
         else{
            hm.put(x, hm.get(x)+1);
         }
        }
        //now we loop to retrieve the key element with the highest frequency
        Integer minKey = (Integer) hm.keySet().toArray()[0];
        Integer maxCount = hm.get(minKey);
        for (Map.Entry<Integer, Integer> set : hm.entrySet()) {
            if(maxCount< set.getValue()){
                maxCount = set.getValue();
                minKey = set.getKey();
            }
            else if(maxCount == set.getValue()){
                if(minKey>set.getKey()){
                    minKey = set.getKey();
                }
            }
          
        }
        return minKey.intValue();
    

        
    }
}