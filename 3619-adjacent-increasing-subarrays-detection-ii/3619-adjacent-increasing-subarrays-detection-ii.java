class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int i=1,pre=0,cur=1,ans=1;
        while(i<nums.size()){
            while(i<nums.size() && nums.get(i-1)<nums.get(i)){
                cur++;
                i++;
            }
            int x = -1;
            if(pre < cur/2){
                x = cur/2;
            }else{
                x = Math.min(pre,cur);
            }
            ans = Math.max(ans,x);
            pre = cur;
            cur = 1;
            i++;
        }
        return ans;
    }
}