class Solution {
    public String clearDigits(String s) {
         Stack <Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(Character.isLetter(c)){
                st.push(c);
            }else if(Character.isDigit(c)){
                if(!st.isEmpty()){
            st.pop();
                }
            }   
        }
        StringBuilder sb=new StringBuilder();
        for(char c:st){
            sb.append(c);
        }
        return sb.toString();
    }
}