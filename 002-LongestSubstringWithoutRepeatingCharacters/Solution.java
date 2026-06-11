import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // To store unique characters in the current window
        HashSet<Character> charSet = new HashSet<>(); 
        int start = 0; // Pointer for the start of the window
        int maxLength = 0; // Variable to track the maximum length

        // Iterate over the string with the `end` pointer
        for (int end = 0; end < s.length(); ++end) {
            // If the character is already in the set, shrink the window from the left
            while (charSet.contains(s.charAt(end))) {
                charSet.remove(s.charAt(start));
                ++start;
            }
            // Add the current character to the set
            charSet.add(s.charAt(end));
            // Update the maximum length
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
