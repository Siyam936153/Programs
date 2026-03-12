class Solution {
      public  void swap(int nums[],int start,int end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
        }
    public void sortColors(int[] nums) {
        int start=0;
        int center=0;
        int end=nums.length-1;
        while(center<=end){
            if(nums[center]==0){
                swap(nums,center++,start++);
            }
            else if(nums[center]==1){
                center++;
            }
            else{
                swap(nums,center,end--);
            }
        }
    }
}
