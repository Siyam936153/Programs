class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
       boolean [][]arr=new boolean[m][n];
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(check(board,word,0,i,j,arr)){
                return true;
            }
        }
       }
       return false;
    }
    public boolean check(char [][]board,String word,int index,int row,int col,boolean [][]arr){
        if(index==word.length())
        return true;
        if(row<0||col<0||row>=board.length||col>=board[0].length||
        word.charAt(index)!=board[row][col])
        return false;
        if(arr[row][col])
        return false;
        arr[row][col]=true;
        boolean left=check(board,word,index+1,row,col+1,arr);
        boolean right=check(board,word,index+1,row,col-1,arr);
        boolean up=check(board,word,index+1,row-1,col,arr);
        boolean down=check(board,word,index+1,row+1,col,arr);
        arr[row][col]=false;
        return left||down||right||up;

    }
}
