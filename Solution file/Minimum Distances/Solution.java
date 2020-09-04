package Solution;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//O(n^2) time complexity
public class Solution {
    static int minimumDistances(int[] a) {
        int minDistance =0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                //if element has a pair
                if(a[i]==a[j]){
                    //calculate the distance between indices
                    int currentDistance = Math.abs(i-j);
                    //if min distance still 0, then mindistance set to this current distance
                    if(minDistance==0){
                        minDistance=currentDistance;
                    }
                    else{
                        //else if the current min distance greater than current distance
                        //then set min distance to this current distance
                        if(minDistance>currentDistance){
                            minDistance=currentDistance;
                        }
                    }  
                }
            }
        }
        //if no similar pair exist, then we know mindistance still 0 hence return -1
        if(minDistance==0){
            return -1;
        }
        //else return min distance
        else{
            return minDistance;
        }
    }
  