import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//O(n) time complexity
public class Solution {
    static int viralAdvertising(int n) {
        //start with no likes and no.of people ad shared to to be 5
        int totalLikes=0;
        int shared=5;
        for(int i=1;i<n+1;i++){
            //add total likes with the floor value of number of people ad was shared
            //that day divided by 2
            totalLikes+=Math.floor(shared/2);
            //number of people the ad was shared to following the next day
            //is the floor of the current shared divided by 2 multiplied by a constant
            //3 of their friends
            shared=(int)Math.floor(shared/2)*3;
        }
        return totalLikes;
    }
