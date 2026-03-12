class Solution {
    public int removeElement(int[] nums, int val) {
        int res = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[res];
                nums[res] = nums[j];
                nums[j] = temp;
                res++;
            }
        }
        return res;
    }
}
