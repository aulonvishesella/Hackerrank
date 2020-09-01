package Solution;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
    // o(1) time complexity
    static String catAndMouse(int x, int y, int z) {

        if(Math.abs(z-x) < Math.abs(z-y)){
            return "Cat A";
        }
        else if(Math.abs(z-x) > Math.abs(z-y)){
            return "Cat B";
        }
        else{
            return "Mouse C";
        }

    }
}
