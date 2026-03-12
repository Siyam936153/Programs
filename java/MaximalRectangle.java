class Solution {
    public int maximalRectangle(char[][] matrix) {
        int max=0;
        if(matrix.length==0){
            return 0;
        }
        int n=matrix.length;
        int m=matrix[0].length;
        int arr[]=new int[m];
        for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
            if(matrix[i][j]=='1'){
                arr[j]+=1;
            }else{
                arr[j]=0;
            }
          }
          max=Math.max(max,largestRectangleArea(arr));
        }
        return max;
    }
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
