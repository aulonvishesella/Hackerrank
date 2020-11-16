import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the cavityMap function below.
    static String[] cavityMap(String[] grid) {
        
       
        for(int i=1;i<grid.length-1;i++){
            for(int j=1;j<grid.length-1;j++){
                //cell is a cavity if each cell adjacent to it has strictly smaller depth
                if((int)grid[i-1].charAt(j) <(int)grid[i].charAt(j)
                    &&(int)grid[i+1].charAt(j) <(int)grid[i].charAt(j)
                    && (int)grid[i].charAt(j+1) <(int)grid[i].charAt(j)
                    && (int)grid[i].charAt(j-1) <(int)grid[i].charAt(j))
                    {
                        //use string builder to replace a specific character at a specific index in the string
                        //in this case we change this specific character to 'X' as it is a cavity
                        StringBuilder sb = new StringBuilder(grid[i]);
                        sb.setCharAt(j, 'X');
                        grid[i] = sb.toString();
                    }
            }
        }
        return grid;
    }