class Solution {
    public int minDeletionSize(String[] strs) {
        //  Creating an cW for the Iteration of the String Coloum Wise 
        int cW = strs[0].length();
        // Creation of the ch for the Iteration of the Array Row Wise
        int cH = strs.length;
        //  declaration of the Varabile for the Counting 
        int count =  0;
        // First For loop  for Chacking 
        for(int i = 0 ;i<cW ; i++){
            // Second for loop for the Array iteration 
            for(int j=1;j<cH;j++){
                // By Passing the First Coloum For Checking
                if(j==0){
                    continue;
                }
                // checking if it is Lexicographically Sorted or not 
                if(strs[j].charAt(i)>=strs[j-1].charAt(i)){
                    continue;
                }else{
                // if the condition got failed 
                    count++;
                    break;
                }
            }
        }
        
        return count;
        
    }
}