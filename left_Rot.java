import java.util.Scanner;
public class left_Rot
{
    public static void main(String[] args)
     {
         Scanner input=new Scanner(System.in);
         int size=input.nextInt();
         int d=input.nextInt();
         int ar[]=new int[size];
         for(int i=0;i<size;i++)
        { 
          ar[i]=input.nextInt();
        }
        int temp;
        int count=0;
        while(count!=d)
        {
             temp=ar[0];
             for( int j=0;j<(size-1);j++)
             { 
                ar[j]=ar[j+1];
             }
             ar[size-1]=temp;
             count++;
         }
        
        for( int j=0;j<size;j++)
        { 
          System.out.print(ar[j]);
        }
        

     }
}