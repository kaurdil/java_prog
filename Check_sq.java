import java.util.Scanner;
 // using the concept of binary search 
public class Check_sq
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no:");
     long n=sc.nextLong();
     long low=0;
     long high=n+1;
     while(high-low>1)
     {
       long mid=(low+high)/2;
       if((mid*mid)==n)
        {
          System.out.println(n+" is perfect sq of "+mid);
          System.exit(0);
           }
       else if((mid*mid)<n)
        {
          low=mid;
           }
       else
         {
           high=mid;
            }
       }
    System.out.println("Not a perfect sq!!");
     
     }
}
