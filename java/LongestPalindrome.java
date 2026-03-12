class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray()) {
            count[c] = count[c] + 1;
        }

        int length = 0;
        boolean a = false;
        for (int c : count) {
            if (c % 2 == 0) {
                length += c;          
            } else {
                length += c - 1;     
                a = true;        
        }
        }
        if (a) {
            length += 1;
        }

        return length;
}
}
