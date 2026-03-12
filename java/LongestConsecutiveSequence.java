class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> hs= new HashSet<>();
        for (int num : nums) {
            hs.add(num);
        }
        int len=0;
        for (int num:hs) {
            if (!hs.contains(num-1)) { 
                int a=num;
                int count=1;

                while (hs.contains(a+1)) {
                    a++;
                    count++;
                }
                 len=Math.max(len,count);
            }
        }
        return len;

    }
}
