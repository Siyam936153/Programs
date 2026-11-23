/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
    int arr[]={4,5,2,10};
    int res[]=new int[arr.length];
    Stack <Integer> s=new Stack<>();
    for(int i=arr.length-1;i>=0;i--){
        while(!s.isEmpty()&&s.peek()<=arr[i]){
            s.pop();
        }
        res[i]=s.isEmpty()?-1:s.peek();
        s.push(arr[i]);
    }
    System.out.println(Arrays.toString(res));
	}
}
