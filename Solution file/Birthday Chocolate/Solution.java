package Solution;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // o(n^2) time complexity
    //d =day of ron's bday, m=month of ron's bday
    static int birthday(List<Integer> s, int d, int m) {
        int counter=0;
        for(int i=0;i<s.size();i++){
            int num=0;
            int lengthSegment=0;
            for(int x=i;x<s.size();x++){
                if(lengthSegment<m){
                    num+=s.get(x);
                    lengthSegment+=1;
                }
                else{
                    break;
                }
            }
            //if the total number is equal to the day, then we can divide it that way
            //so we add 1 to the counter
            if(num==d){
                    counter+=1;
             }
        }
        return counter;
    }
}
