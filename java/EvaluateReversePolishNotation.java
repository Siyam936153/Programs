class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> st=new Stack<>();
        for(String c:tokens){
            if(c.equals("*")){
                int x=st.pop();
                int y=st.pop();
                st.push(x*y);
            }
            else if(c.equals("/")){
                int x=st.pop();
                int y=st.pop();
                st.push(y/x);
            }else if(c.equals("+")){
                int x=st.pop();
                int y=st.pop();
                st.push(x+y);
            }else if(c.equals("-")){
                int x=st.pop();
                int y=st.pop();
                st.push(y-x);
            }else{
                st.push(Integer.parseInt(c));
            }
        }
        return st.pop();
    }
}
