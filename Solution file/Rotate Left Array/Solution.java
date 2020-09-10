package Solution;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // O(n) time complexity
    static int[] rotLeft(int[] a, int d) {
        int n = a.length;
        //rotated array will have the final rotated elements
        int[] rotatedArray = new int[n];
        for(int i=0;i<n;i++){
             int mod = d % n;
             int finalPos = (i+mod)%n;
             rotatedArray[i] = a[finalPos]; 
        
        }

        return rotatedArray;


    }