class Solution {
    public String longestPalindrome(String s) {
        String A = s;
        String odd , even; 
        String Sd = "" ;
        for(int i =0 ;i<A.length();i++){
            odd = p(A,i,i);
            if((odd.length())>(Sd.length())){
                Sd=odd;
            }
            even = p(A,i,i+1);
            if((even.length())>(Sd.length())){
                Sd=even;
            }
           // ans = Math.max(ans,Math.max(odd.length(),even.length()));
           
        }
        return Sd ;
    }
    
public String p(String S ,   int i  ,   int  j ){
        while ((i>=0)&&(j<S.length())&&(S.charAt(i)==S.charAt(j))){
            i--;
            j++;
        }
        return S.substring(i+1,j);
    }
    public String ps(String S ,   int i  ,   int  j ){
        while ((i>=0)&&(j<S.length())&&(S.charAt(i)==S.charAt(j))){
            i--;
            j++;
        }
        StringBuilder DF = new StringBuilder();
        for (int k = i;k<=j;k++){
            DF.append(S.charAt(i));
        }
        return DF.toString();
    }
}

