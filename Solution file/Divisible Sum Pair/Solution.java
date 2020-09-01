package Solution;

public class Solution {
	 
	//o(n) time complexity
	static int divisibleSumPairs(int n, int k, int[] ar) {
         //n= length of ar
         //k = what we need to divide it by
         //ar = array of the integers
         int counter=0;
         for(int i=0;i<n;i++){
             for(int j=i+1;j<n;j++){
                 if((ar[i] + ar[j])% k == 0){
                     counter+=1;
                 }
             }
         }

         return counter;
       
	}
}
