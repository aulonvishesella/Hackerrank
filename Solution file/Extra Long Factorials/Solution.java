package Solution;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
      BigInteger temp = BigInteger.valueOf(1);
 
      for(int i=1;i<=n;i++){
         temp=temp.multiply(BigInteger.valueOf(i));
      }

      System.out.print(temp);
    }
}