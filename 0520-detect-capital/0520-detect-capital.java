class Solution {
    public boolean detectCapitalUse(String word) {
        char cs =word.charAt(0);
        boolean firstElement = ((cs-'A') >=0) && ((cs-'A')<=26 );
        int count = 0;
        for (int i =0 ;i<word.length() ; i++){
            char c = word.charAt(i);
            if((c-'A' >=0) &&(c-'A'<=26 )){
                count++;
            }
        }
        return (count==1 && firstElement==true) || (count==word.length()) ||(count==0) ;
        
    }
}