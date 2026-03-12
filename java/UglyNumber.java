class Solution {
    public boolean isUgly(int n) {
    if (n<=0) {
        return false;
    }
        int[] prim = {2, 3, 5};
        for (int p:prim) {
            while (n%p==0) {
                n=n/p;
            }
        }
        if(n==1){
            return true;
        }
        return false;    
    }
}
