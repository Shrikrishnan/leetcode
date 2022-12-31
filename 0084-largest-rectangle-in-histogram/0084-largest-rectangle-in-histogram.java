class Solution {
    
   public int largestRectangleArea(int[] heights){
       int [] A = heights;
        int n=A.length;
        int ans=0;
       // if(n==1) return A[0];
        int left[]=smallestElementIndexLeft(A);
        int right[]=smallestElementIndexRight(A);

        for(int i=0;i<n;i++){
            int p1=left[i];
            int p2=right[i];
            int width=p2-p1-1;
            ans=Math.max(ans,width*A[i]);
        }
        return ans;
    }

    public int[] smallestElementIndexLeft(int[] A){
        int n=A.length;
        int ans[]=new int[n];
        Arrays.fill(ans,-1);
        Stack<Integer>st=new Stack();

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && A[st.peek()]>= A[i]){
                st.pop();
            }

            if(!st.isEmpty()){
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    public int[] smallestElementIndexRight(int[] A){
        int n=A.length;
        int ans[]=new int[n];
        Arrays.fill(ans,n);
        Stack<Integer>st=new Stack();

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && A[st.peek()]>= A[i]){
                st.pop();
            }

            if(!st.isEmpty()){
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;
    }

}



