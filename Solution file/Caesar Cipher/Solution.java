package Solution;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//O(n) time complexity
public class Solution {
    static String caesarCipher(String s, int k) {
        String ciphertext = "";
        for(int i=0;i<s.length();i++){
            char currentChar = s.charAt(i);
            int currentAscii = (int)currentChar;
            //case 1 : if upper case letter
            if(currentAscii>=65 && currentAscii <=90){
                currentAscii=currentAscii-65;
                int position = (currentAscii+k)% 26;
                int encryptedAscii = 65+position;
                ciphertext+=(char)encryptedAscii;
            }
            // case 2 : if lowercase letter
            else if(currentAscii>=97 && currentAscii <=122){
                currentAscii=currentAscii-97;
                int position = (currentAscii+k)% 26;
                int encryptedAscii = 97+position;
                ciphertext+=(char)encryptedAscii;
            }
            //case 3: then it is a symbol so we add to ciphertext
            else {
                ciphertext+=currentChar;
            }
        }
        return ciphertext;
    }
}
