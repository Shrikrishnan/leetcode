
class Solution {
// DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
public int[] maxSlidingWindow(int[] nums, int k) {
int []A = nums;
int B = k;
int[] opt = new int[A.length - B + 1];
Deque<Integer> deque = new LinkedList<Integer>();
deque.add(A[0]);

//prepare the window and the deque first.
for(int i = 1; i < B; i++){
while(!deque.isEmpty() && deque.peekLast() < A[i]){
deque.removeLast();
}

deque.addLast(A[i]);
}

opt[0] = deque.peek();
//Then start sliding
for(int i = 1; i <= A.length - B; i++){
if(deque.peek() == A[i-1]){
deque.remove();
}

//i-1 is removed, i+k-1 is added in window
while(!deque.isEmpty() && deque.peekLast() < A[i+B-1]){
deque.removeLast();
}

deque.addLast(A[i+B-1]);
opt[i] = deque.peek();
}


return opt;
}
}
