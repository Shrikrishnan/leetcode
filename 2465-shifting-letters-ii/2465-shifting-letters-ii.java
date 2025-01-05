class Solution {
    int[] prefixSumArray;

    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        prefixSumArray = new int[n + 1]; // Use n+1 for easier prefix sum calculation

        // Update the prefix array based on the shifts
        for (int[] shift : shifts) {
            int startIndex = shift[0];
            int endIndex = shift[1];
            int direction = shift[2];
            
            // Increment or decrement based on direction
            if (direction == 1) {
                prefixSumArray[startIndex] += 1;
                if (endIndex + 1 < n) {
                    prefixSumArray[endIndex + 1] -= 1;
                }
            } else {
                prefixSumArray[startIndex] -= 1;
                if (endIndex + 1 < n) {
                    prefixSumArray[endIndex + 1] += 1;
                }
            }
        }

        // Compute the prefix sum to calculate net shifts
        for (int i = 1; i < n; i++) {
            prefixSumArray[i] += prefixSumArray[i - 1];
        }

        // Construct the result string
        return findResult(s);
    }

    public String findResult(String s) {
        StringBuilder result = new StringBuilder();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int shift = prefixSumArray[i] % 26; // Normalize the shift to within [0, 25]
            if (shift < 0) shift += 26; // Handle negative shifts
            char newChar = (char) ('a' + (s.charAt(i) - 'a' + shift) % 26);
            result.append(newChar);
        }

        return result.toString();
    }
}
