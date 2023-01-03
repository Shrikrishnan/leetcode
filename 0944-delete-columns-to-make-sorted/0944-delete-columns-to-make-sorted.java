class Solution {
    public int minDeletionSize(String[] strs) {
        int count=0;
        char prev='a';
        char a='a';
        for(int i=0; i<strs[0].length(); i++){
             a='a';
            for(int j=0; j<strs.length;j++){
                prev=a;
                a=strs[j].charAt(i);
                if(j==0) continue;
                if(prev<=a) continue;
                else{
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}