import java.util.Scanner;
public class TwoD
 {
  public static void main(String[] args)
  {
   Scanner input=new Scanner(System.in);
   System.out.println("enter no of rows");
   int row= input.nextInt();
   System.out.println("enter no of column");
   int column=input.nextInt();
   int [][]ar= new int[row][column];

   for(int i=0;i<row;i++)
    {
       for(int j=0;j<column;j++)

       { 
         System.out.println("enter element:");
         ar[i][j]=input.nextInt();
        }

     }
    System.out.println("row major matrix:");
    for(int i=0;i<row;i++)
    {
       for(int j=0;j<column;j++)

       { 
         
         System.out.print(ar[i][j]+ "\t");
         
        }
        System.out.println();
     }
    System.out.println("column major matrix:");
    for(int i=0;i<row;i++)
    {
       for(int j=0;j<column;j++)

       { 
         System.out.print(ar[j][i]+ "\t");
        }
       System.out.println();
     }
   }
 }