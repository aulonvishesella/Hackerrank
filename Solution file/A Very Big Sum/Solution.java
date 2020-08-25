package Solution;

public class Solution {
  
  static long aVeryBigSum(long[] ar) {
            long bigSum = 0;
            for(int i = 0; i<ar.length;i++){
                //add the current array value with bigSum
                bigSum += ar[i];
            }
            return bigSum;
    }

}
