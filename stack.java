import java.util.*;
public class MyClass {
  public static void main(String args[]) {
  String str="JAVA";
  Stack<Character> s=new Stack<>();
  for(char c:str.toCharArray()){
      s.push(c);
  }
  String res="";
  while(!s.isEmpty()){
      res+=s.pop();
  }
  System.out.print(res);
  }
}
