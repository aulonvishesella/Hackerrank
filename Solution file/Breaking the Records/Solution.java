package Solution;


	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class Solution {

	    // o(n) time complexity
	    static int[] breakingRecords(int[] scores) {
	        int minChange = 0;
	        int maxChange =0;
	        int[] scoreChange = new int[2];
	        int min= scores[0];
	        int max = scores[0];
	        for(int i=0;i<scores.length;i++){
	            if(scores[i]>max){
	                max=scores[i];
	                maxChange+=1;
	            }
	            if(scores[i]<min){
	                min=scores[i];
	                minChange+=1;
	            }
	        }

	        scoreChange[0] = maxChange;
	        scoreChange[1] = minChange;
	        return scoreChange;

	    }
}
