class Solution {
    public int maxScore(String s) {
    //     int countZero=0;
    //     int totalCountOne=0;
    //     int CountOne = 0;
    //     int result=0;
    //     for(int i=0;i<s.length();i++){
    //         if(s.charAt(i)== '1'){
    //             totalCountOne++;
    //         }
    //     }

    //     for(int i=0;i<s.length();i++){
    //         if(s.charAt(i)== '0'){
    //             countZero++;
    //         }else{
    //             CountOne++;
    //         }
    //         result = Math.max(countZero+(totalCountOne-CountOne),result);
    //     }

    //     return result;
    // }

        int ans = 0;
        
        for (int i = 0; i < s.length() - 1; i++) {
            int curr = 0;
            for (int j = 0; j <= i; j++) {
                if (s.charAt(j) == '0') {
                    curr++;
                }
            }
            
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    curr++;
                }
            }
            
            ans = Math.max(ans, curr);
        }
        
        return ans;
    }
    }