class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int t=image[sr][sc];
        if(t!=color){
            check(image,sr,sc,color,t);
        }
        return image;
    }
public void check(int [][]image,int i,int j,int color,int t){
    if(i<0||j<0||i>=image.length||j>=image[0].length||image[i][j]!=t){
        return;
    }
    image[i][j]=color;
    check(image,i-1,j,color,t);
    check(image,i+1,j,color,t);
    check(image,i,j-1,color,t);
    check(image,i,j+1,color,t);
    }
}
