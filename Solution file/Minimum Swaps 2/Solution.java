import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int n= arr.length;
        int i=0;
        int swap=0;
        while(i<n){
            //if the current value is not in the correct index, then swap with the value in that index
            //incremenet swap counter
            if(arr[i]!=i+1){
                 int temp=arr[arr[i]-1];
                 arr[arr[i]-1] = arr[i];
                 arr[i] = temp;
                 swap++;
            }
            //if the value is where its meant to be, increment
            else{
                i++;
            }
        }
        return swap;
    }