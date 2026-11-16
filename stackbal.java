import java.util.*;
public class MyClass {
  public static void main(String args[]) {
  String str="{[()]}";
  Stack<Character> s=new Stack<>();
  boolean val=true;
  for(char c:str.toCharArray()){
      if(c=='('||c=='{'||c=='['){
      s.push(c);
  } 
  else if(c==')'||c=='}'||c==']'){
      if(s.isEmpty()){
          val=false;
          break;
      }
      char top=s.pop();
      if((c==')'&&top!='(')||(c=='}'&&top!='{')||(c==']'&&c=='[')){
          val=false;
          break;
      }
  }
  }
  if(!s.isEmpty()){
      val=false;
  }
  System.out.print(val?"Balanced":"not Balanced");
  }
}
