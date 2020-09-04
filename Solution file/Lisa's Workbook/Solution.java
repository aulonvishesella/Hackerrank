package Solution;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//o(n^2) time complexity
public class Solution {

    // Complete the workbook function below.
    static int workbook(int n, int k, int[] arr) {
        int count = 0;
        int currentPage = 1;
        // chapter
        for(int i = 0; i < arr.length; i++) {
            int NumberOfProblems = arr[i];
            // problems
            for(int j = 1; j <= arr[i]; j++) {
                //if the current problem == current page number, then add to count
                if(j == currentPage) {
                    count++;
                }
                // the current problem has reached max number for given page, then 
                //increase page
                if((j % k == 0) || j == NumberOfProblems) {
                    currentPage++;
                }
            }
        }
        return count;
    }

  
