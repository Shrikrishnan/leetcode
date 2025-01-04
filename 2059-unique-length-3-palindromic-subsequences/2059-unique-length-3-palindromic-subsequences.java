import java.util.HashSet;

class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        HashSet<String> uniquePalindromes = new HashSet<>();

        // Track the first and last occurrence of each character
        int[] first = new int[26];
        int[] last = new int[26];
        for (int i = 0; i < 26; i++) {
            first[i] = -1;
            last[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            int idx = s.charAt(i) - 'a';
            if (first[idx] == -1) {
                first[idx] = i;
            }
            last[idx] = i;
        }

        // Fix the middle character
        for (int i = 0; i < n; i++) {
            char middle = s.charAt(i);
            int middleIdx = middle - 'a';

            // Check all possible characters for `a` (the same on both ends)
            for (char c = 'a'; c <= 'z'; c++) {
                int charIdx = c - 'a';
                if (first[charIdx] != -1 && first[charIdx] < i && last[charIdx] > i) {
                    // Valid palindrome: "a b a"
                    uniquePalindromes.add("" + c + middle + c);
                }
            }
        }

        // Return the count of unique palindromes
        return uniquePalindromes.size();
    }
}
