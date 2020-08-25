package Solution;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the flatlandSpaceStations function below.
    static int flatlandSpaceStations(int n, int[] c) {
        int []distances = new int[1];
        int tempDistance=0;
        int dis=0;
        for(int i=0;i<n;i++){
            tempDistance=Math.abs(i-c[0]);
            for(int j=0;j<c.length;j++){
                dis=Math.abs(i-c[j]);
                if(dis<=tempDistance){
                    tempDistance=dis;
                }
            }
            //the max distance will be at the first index 
            if(tempDistance>=distances[0]){
                distances[0] = tempDistance;
            }
        }      

       
        return distances[0];
        
    }
}