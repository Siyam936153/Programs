class Solution {
    public boolean backspaceCompare(String s, String t) {
       Stack<Character>ss=new Stack<>();
       Stack<Character>st=new Stack<>();
       for(char cs:s.toCharArray()){
        if(cs =='#'){
            if(!ss.isEmpty())
            ss.pop();
        }
        else
        ss.push(cs);
       } 
       for(char ct:t.toCharArray()){
        if(ct=='#'){
            if(!st.isEmpty())
            st.pop();
        }
        else
        st.push(ct);
       }
       if(ss.size()!=st.size())
       return false;
        while(!ss.isEmpty())
        {
            if(ss.pop()!=st.pop())
            return false;
        }
    return true;
    }
}
