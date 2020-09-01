import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // O(n) time complexity
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    	
            int aScore = 0;
            int bScore = 0;
            List<Integer> scores = new ArrayList<Integer>(); 
            for(int i =0 ; i<3;i++){
                if(a.get(i) > b.get(i)){
                    aScore +=1;
                }
                else if(a.get(i) < b.get(i)){
                    bScore+=1;
                }
                else{
                    aScore +=0;
                    bScore +=0;
                }
            }
             scores.add(aScore);
             scores.add(bScore);
            return scores;

           
    }
}

