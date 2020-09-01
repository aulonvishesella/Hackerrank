package Solution;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the libraryFine function below.
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
    	
            if(y1<y2 && m1<m2 || y1==y2 && m1<m2){
                return 0;
            }
           
            else if(y1==y2 && m1==m2){
                if(d1<=d2){
                    return 0;
                }
                else{
                    return 15*(d1-d2);
                }
            }

            else if(y1==y2 && m1>m2){
                return 500*(m1-m2);
            }
            else if(y1<y2){
                return 0;
            }
            else{
                return 10000;
            }            
 
    }
}