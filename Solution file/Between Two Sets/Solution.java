package Solution;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    
    //o(n^2) time complexity
    public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
    int counter = 0;
    int number=a.get(a.size()-1);
    int difference = b.get(0) - number;
    List<Integer> potential = new ArrayList<Integer>();
    for(int i=0;i<=difference;i++){
        boolean works=false;
        for(int x=0;x<a.size();x++){
            if(number%a.get(x)==0){
                works=true;
            }
            else{
                works=false;
                break;
            }
        }
        if (works==true){
            potential.add(number);
        }
        number+=1;
    }

    for(int i=0;i<potential.size();i++){
        boolean works=false;
        for(int x=0;x<b.size();x++){
            if(b.get(x)%potential.get(i) == 0){
                 works=true;
            }
            else{
                works=false;
                break;
            }
        }
        if(works==true){
            counter+=1;
        }
    }
    return counter;
    }
    
}
