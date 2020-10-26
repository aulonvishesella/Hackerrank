import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
       Stack<Character> stack = new Stack();
       //loop through each character in the string
       for(int i=0;i<s.length();i++){
            //push opening brackets first onto the stack
           if(s.charAt(i) == '{' || s.charAt(i)=='[' || s.charAt(i) == '('){
               stack.push(s.charAt(i));
           }
           //if stack is empty and we recieve a closing brace, then we know the string is not balanced so we return NO
           else if(stack.isEmpty()){
               return "NO";
           }
           else{
               //we pop the current TOS
               char currentTop = stack.pop();
               //check the current closing brace char with the current TOS. If matches, then its balanced so we continue
               if(s.charAt(i) == '}' && currentTop == '{'){
                  continue;
               }
               else if(s.charAt(i) == ')' && currentTop == '('){
                  continue;
               }
               else if(s.charAt(i) == ']' && currentTop == '['){
                  continue;
               }
               //if not, then we know it string is not balanced so return no
               else{
                   return "NO";
               }
           }
       }
       //stack is empty if we we have popped all the opening braces because it was in a balance order. Therefore return YES if stack is empty else return NO
       if(stack.isEmpty()){
           return "YES";
       }
       else{
           return "NO";       
       }


    }
