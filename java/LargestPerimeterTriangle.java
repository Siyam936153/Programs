class Solution {
    public int largestPerimeter(int[] nums) {
       Arrays.sort(nums);
       int p=0;
       for(int i=0;i<nums.length-2;i++){
        int a=nums[i];
        int b=nums[i+1];
        int c=nums[i+2];
        int sum=a+b;
         if(sum>c){
           p=sum+c; 
         }
       }
       return p; 
    }
}
