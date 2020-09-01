package Solution;

public class Solution {
    //o(n^2) time complexity
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int maxExpenditure = 0;
        //for each keyboard, we loop through each drive
        for(int i=0;i<keyboards.length;i++){
            for(int j=0;j<drives.length;j++){
            	//if both the sum keyboard and drive does not exceed limit
                if(keyboards[i]+drives[j]<=b){
                	//if the sum exceeds the current max, then we set the current max to this new sum
                    if(keyboards[i]+drives[j]>maxExpenditure){
                        maxExpenditure = keyboards[i]+drives[j];
                    }
                }
            }
        }
        
        //if max does not change, it means we the drives and keyboard combo exceeded limit
        if(maxExpenditure == 0){
            return -1;
        }
        else {
            return maxExpenditure;
        }


    }
}
