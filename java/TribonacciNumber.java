class Solution {
    public int tribonacci(int n) {
         int t=0;
        int t1=1;
        int t2=1;
        int temp=-1;
         if(n==0){
         return t;   
        }
        if(n==1||n==2){
            return t1;
        }
         for(int i=3;i<=n;i++){
           temp=t+t1+t2;
           t=t1;;
           t1=t2;
           t2=temp;
        }
        return temp;
    }
}
