package Solution;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        int count=0;
        int k1= x1;
        int k2= x2;
        for(int i=0;i<100000;i++){
            k1+=v1;
            k2+= v2;
            if(k1==k2){
                count+=1;
            }
        }
        if(count==0){
            return "NO";
        }
        else{
            return "YES";
        }

    }
}