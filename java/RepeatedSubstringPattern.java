class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String temp = s.concat(s);
        String sub = temp.substring(1, temp.length() - 1);
        return sub.contains(s);
    }
}
