class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0;
        int r=nums[nums.length-1]-nums[0];
        while(l<=r){
            int mid=l+(r-l)/2;
           int start=0;
           int end=0;
           int count=0;
           while(end<nums.length){
            if(nums[end]-nums[start]>mid){
                start++;
            }else{
                count=count+end-start;
                end++;
            }
           }
           if(count>=k){
            r=mid-1;
           }else{
            l=mid+1;
           }
        }
        return l;
    }
}
