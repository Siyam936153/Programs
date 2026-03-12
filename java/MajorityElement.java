class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> li=new ArrayList<>();
        int n=nums.length;
        int no=n/3;
        Arrays.sort(nums);
        int count=1;
        for (int i=1;i<n;i++) {
            if (nums[i]==nums[i-1]) {
                count++;
            } else {
                if (count>no) {
                    li.add(nums[i-1]);
                }
                count=1;
            }
        }
        if(count>no) {
            li.add(nums[n-1]);
        }
        return li;
    }
}
