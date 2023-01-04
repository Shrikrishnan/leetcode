class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i =0 ;i<tasks.length ;i++){
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }
        int count = 0;
        for(int n:map.values()){
            if(n==1){
                return -1;
            }
            count = count+((n+2)/3);
        }
        return count ;
    }
}

