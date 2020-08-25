package Solution;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
   
    // Complete the howManyGames function below.
    static int howManyGames(int p, int d, int m, int s) {
        int count = 0;
        //keep looping until the money we have to spend is greater than price
        while(s>=p){
            count++;
            s -=p;   //minus money to spend after buying product with that price
            p = Math.max(p-d,m); 
        }
        return count;
             

    }
}
