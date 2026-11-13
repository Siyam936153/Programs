public class MyClass {
  public static void main(String args[]) {
   int arr[]={55,20,15,40,45};
   int fl=0;
   int sl=0;
   for(int i=0;i<arr.length;i++){
       if(arr[i]>fl){
           sl=fl;
           fl=arr[i];
   }else if(sl<arr[i]&&fl!=arr[i]){
       sl=arr[i];
   }
  }
  System.out.print(sl);
}
}
