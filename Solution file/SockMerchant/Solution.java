import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


//O(n) time complexity
public class Solution {

    // create a hashmap where the key is the integer and the value is the count
    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> colours = new HashMap<Integer, Integer>();
        int countPairs=0;
        for(int i=0;i<n;i++){
            if(!colours.containsKey(ar[i])){
                colours.put(ar[i],1);
            }else{
                //if we there are 2 of these so far, we count the number of pairs and remove the key from the hashmap
                countPairs+=1;
                colours.remove(ar[i]);
            }
        }
        return countPairs;
    }
