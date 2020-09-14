import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
  // O(n) time complexity
public class Solution {
    static int minimumNumber(int n, String password) {
        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";
        boolean containNumber=false;
        boolean containLower=false;
        boolean containUpper=false;
        boolean containSpecial=false;
        int count=0;
            for(int i=0;i<n;i++){
                //if it contains 1 number at least, add to count
                if(!numbers.contains(password.substring(i,i+1)) == true && containNumber==false){
                    count++;
                    containNumber=true;
                }
                     //if it contains 1 lower at least, add to count
                if(lower_case.contains(password.substring(i,i+1)) ==true && containLower==false){
                    count++;
                    containLower=true;

                }
                //if it contains 1 upper at least, add to count
                if(upper_case.contains(password.substring(i,i+1)) ==true && containUpper==false){
                    count++;
                    containUpper=true;
                }
                //if it contains 1 special at least, add to count
                if(special_characters.contains(password.substring(i,i+1)) ==true && containSpecial==false){
                    count++;
                    containSpecial=true;
                }

            }
            if(n>=6){
                return 4-count;
            }
            else{
                int amountToAdd = (4-count);
                if(amountToAdd + n >=6){
                    return amountToAdd;
                }
                else{
                    int amountAfter = 6-(amountToAdd+n);
                    return amountToAdd + amountAfter;
                }
            }
    }