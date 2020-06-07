import java.util.Scanner;
public class arr_man
{
  public static void main(String[] main)
   {
      
         Scanner input=new Scanner(System.in);
         System.out.println("enter array size");
         int size=input.nextInt();
         System.out.println("enter no of operations");
         int query=input.nextInt();
         String d[][]=new String[query+1][4];
         int ar[]=new int[size+1];
         for(int i=1;i<(size+1);i++)
        { 
          ar[i]=0;
        }
         for(int i=1;i<(size+1);i++)
        { 
          System.out.print(ar[i]+" ");
        }
         System.out.println("enter array element");
          for(int i=1;i<(query+1);i++)
          {
           for(int j=1;j<4;j++)
            {
              d[i][j]=input.nextInt();
            }
          }
          
          for(int i=1;i<(query+1);i++)
          {
             int m,n,value;
             for(int j=1;j<2;j++)
              {
                m=d[i][1];
                n=d[i][2];
                value=d[i][3];
                System.out.println(m+" "+n+" "+value);
                for(int k=m;k<(n+1);k++)
                  {
                    ar[k]+=value;
                    }
                System.out.print("modified array:");
                for(int k=1;k<(size+1);k++)
                  {
                    System.out.print(ar[k]+" ");
                    }
               }
               System.out.println();
            }
         //find maximum
          int max=ar[1];
          for(int k=1;k<(size+1);k++)
           {
             
             if(max<ar[k])
               {
                  max=ar[k];
                }
           }
            System.out.println(max);
     }
 }