class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s=new Stack<>();
        int maxarea=0;
        for(int i=0;i<=heights.length;i++){
            int curr=(i==heights.length)?0:heights[i];
            while(!s.isEmpty()&&curr<heights[s.peek()]){
                int high=heights[s.pop()];
                int width=0;
                if(s.isEmpty()){
                    width=i;
                }else{
                    width=(i-s.peek()-1);
                }
                maxarea=Math.max(maxarea,high*width);
            }
            s.push(i);
        
        }
        return maxarea;
    }
}
