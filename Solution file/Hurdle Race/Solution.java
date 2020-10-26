import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//O(n) time complexity
public class Solution {
    static int hurdleRace(int k, int[] height) {
        //find the max unit character can jump
        int max = height[0];
        for(int i=0;i<height.length;i++){
            if(max<height[i]){
                max=height[i];
            }
        }
        //can already jump all the hurdles, so no need to drink anymore doses
        if(max<=k){
            return 0;
        }
        //character can jump unit of 'max', but the tallest hurdle has a height of k
        //therefore need max-k number of doses
        else{
            return max-k;
        }

    }
