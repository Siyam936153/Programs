class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int len = 10;
        List<String> res = new ArrayList<>();
        Set<String> ans = new HashSet<>();
        Set<String> r= new HashSet<>();

        for (int i=0;i<=s.length()-len;i++) {
            String c=s.substring(i,i+len);
            if (!ans.add(c)) {
                    r.add(c);
                }
        }
        res.addAll(r);
        return res;
    }
}
