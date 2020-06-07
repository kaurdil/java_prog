import java.util.Scanner;
public class Sparse
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
           System.out.println("enter elements");
           ar[i][j]=input.nextInt();
         
        }
       
     }
     int k=0;
     for(int i=0;i<row;i++)
    {
       for(int j=0;j<column;j++)

       {  
           if(ar[i][j]!=0)
             {
               k++;
             }
         
        }
       
     }
    System.out.println("matrix:");
    int [][]temp=new int[3][k];
    int n=0;
    for(int i=0;i<row;i++)
    {
       for(int j=0;j<column;j++)

       { 
         if(ar[i][j]!=0)
          {
           temp[0][n]=i;
           temp[1][n]=j;
           temp[2][n]=ar[i][j];
           n++;
          }
         
        }
     }
     for(int i=0;i<3;i++)
    {
       for(int j=0;j<k;j++)

       { 
           System.out.print(temp[i][j]+"\t");
          
         
        }
       System.out.println();
     }
    
   }
 }