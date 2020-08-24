package Solution;

public class Solution {
   /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        
    	//if 12PM,  military time remains the same
        if(s.substring(8, 10).equals("PM") && s.substring(0,2).equals("12")){
            return (s.substring(0,8));
        }  
        //if PM but not 12, then we need to add 12 e.g. 1:05:45PM becomes 13:05:45PM in military time 
        else if(s.substring(8, 10).equals("PM") && !s.substring(0,2).equals("12")){
            int i = Integer. parseInt(s.substring(0,2));
            int x = i+12;
            String newString = Integer.toString(x) + s.substring(2,8);
            return newString;
        }
        //if 12AM but not 12, then we change 12 to 00 e.g. 12:04:12AM becomes 00:04:12AM in military tiome
        else if(s.substring(8, 10).equals("AM") && s.substring(0,2).equals("12")){
            String newString = "00" + s.substring(2,8);
            return newString;

        }
        else{
           return (s.substring(0,8));
        }
            
    }

}
