import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> colours = new HashMap<Integer, Integer>();
        int countPairs=0;
        for(int i=0;i<n;i++){
            if(!colours.containsKey(ar[i])){
                colours.put(ar[i],1);
            }else{
                countPairs+=1;
                colours.remove(ar[i]);
            }
        }
        return countPairs;
    }