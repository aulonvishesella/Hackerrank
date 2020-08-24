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
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {

   
    int aCol= 0;
    int bCol = 0;
    int j1 =0;
    int j2=arr.size()-1;
    for(int i=0;i<arr.size();i++){
        aCol += arr.get(i).get(j1);
        j1++;
    }
    for(int i=0;i<arr.size();i++){
        bCol += arr.get(i).get(j2);
        j2--;
    }

    return Math.abs(aCol - bCol); 

    }

}
