class Solution {
    public String decodeString(String s) {
      Stack <Character> sta= new Stack<>();
      for(char c:s.toCharArray()){
        if(c!=']'){
            sta.push(c);
        }else{
        StringBuilder a=new StringBuilder();
        while(!sta.isEmpty()&&sta.peek()!='['){
             a.insert(0,sta.pop());
        }
         if (!sta.isEmpty()&&sta.peek()=='[') {
                    sta.pop();
         }
        StringBuilder n=new StringBuilder();
        while(!sta.isEmpty()&&Character.isDigit(sta.peek())){
            n.insert(0,sta.pop());
        }
          int r = 1;
         if (n.length() > 0) {
         r = Integer.parseInt(n.toString());
                   }
         String rep = a.toString().repeat(r);
         for (char ch : rep.toCharArray()) {
         sta.push(ch);
          }
         }    
        }
        StringBuilder stack= new StringBuilder();
     while (!sta.isEmpty()) {
    stack.append(sta.pop());
}
stack.reverse();
return stack.toString();
    }
}
