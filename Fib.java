import java.util.Scanner;
class Fibo
{
  public void fibonacci(int n)
  {
    int t1=0;int t2=1,sum=0;
    for(int i=0;i<n;i++)
       {
         System.out.print(t1+"");
         sum=t1+t2;
      
         t1=t2;
         t2=sum;
         }
  }
}
public class Fib
{
  public static void main(String args[])
   {
     Scanner s= new Scanner(System.in);
     int n=s.nextInt();
     Fibo f= new Fibo();
     f.fibonacci(n);
     
     
    }
 }