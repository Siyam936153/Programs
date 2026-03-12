class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int tgas=0;
        int cgas=0;
        int index=0;
        for(int i=0;i<n;i++){
           tgas+=gas[i]-cost[i];
           cgas+=gas[i]-cost[i];
           if(cgas<0){
            index=i+1;
            cgas=0;
           }
        }
        return tgas>=0?index:-1;
    }
}
