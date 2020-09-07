package Solution;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Solution {

    
    static int squares(int a, int b) {
        int count = (int)Math.floor(Math.sqrt(b)) - (int)Math.floor(Math.sqrt(a - 1));
        return count;
    }