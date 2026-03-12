class Solution {
    public int calPoints(String[] operations) {
      Stack <Integer> s= new Stack<>();
      for(String c:operations){
        if(c.equals("C")){
           s.pop();
           }
        else if(c.equals("D")){
           s.push(s.peek()*2);
         }
        else if(c.equals("+")){
            int a=s.pop();
            int b=s.peek();
            int ch=a+b;
            s.push(a);
            s.push(ch);
        }
        else{
            s.push(Integer.parseInt(c));
        }
      }
            int sum=0;
            for(int str:s ){
                sum+=str;
            }
       return sum;
    }
}
