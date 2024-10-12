class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> duplicatedRemovedSet = new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            if (!duplicatedRemovedSet.contains(nums[i])){
                duplicatedRemovedSet.add(nums[i]);
            } 
        }
        for (int i= 0;i<duplicatedRemovedSet.size();i++){
            nums[i] = duplicatedRemovedSet.get(i);
        }
        return duplicatedRemovedSet.size();
    }
}
// solved in 18:51:55