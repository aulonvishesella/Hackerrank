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
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
        List<Integer> roundedGrades= new ArrayList<Integer>();
        for(int i=0;i<grades.size();i++){
            if((grades.get(i)+1)%5==0 && grades.get(i) >=38){
                roundedGrades.add(grades.get(i)+1);
            }
            else if((grades.get(i)+2)%5==0 && grades.get(i) >=38){
                roundedGrades.add(grades.get(i)+2);
            }
            else{
                roundedGrades.add(grades.get(i));
            }
        }
        return roundedGrades;
    }

}
