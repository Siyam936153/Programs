class Solution {
    public int clumsy(int n) {
     Stack<Integer> st=new Stack<>();
     int op=0;
     st.push(n);
     for(int i=n-1;i>=1;i--){
      if (op == 0) {                 
        int m = st.pop();
        st.push(m * i);
        } else if (op == 1) {          
        int m = st.pop();
        st.push(m / i);
     }else if(op==2){
        st.push(i);
     }else {
        st.push(-i);
     }
        op=(op+1)%4;
     }
     int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}
