import java.util.Scanner;
public class hourglass_sum
   { 
     
     public static void main(String[] args)
     {
       
       Scanner input = new Scanner(System.in);
       
       /*System.out.println("enter the no of rows");
       int row=input.nextInt();
       System.out.println("enter the no of columns");
       int column=input.nextInt();
       int ar[][]=new int [row][column];
       for(int i=0;i<row;i++)
        { 
          for(int j=0;j<column;j++)
            {
              ar[i][j]=input.nextInt();
             }
        }*/
        //int [][] ar = new int[6][6];
        int [][] ar ={  {-9, -9, -9, 1, 1, 1},
                        { 0, -9,  0, 4, 3, 2},
                        {-9, -9, -9, 1, 2, 3},
                        { 0,  0,  8, 6, 6, 0},
                        { 0,  0,  0,-2, 0, 0},
                        { 0,  0,  1, 2, 4, 0}, 
                                             };
       for(int i=0;i<6;i++)
        { 
          for(int j=0;j<6;j++)
            {
              System.out.print(ar[i][j]+" ");
             }
          System.out.println();
        }
        
        int sum=0;
        int count=0;
        for(int i=0;i<6;i++)
        { 
          
          for(int j=count;j<6;j++)
            {  
               if(count<=2 && count!=1)
               {
                  sum+=ar[i][j];
                  sum+=ar[i+2][j];
                  count++;
                  if(count>2)
                    {
                      System.out.print(sum+",");
                      sum=0;
                      
                            }
                     }
               else if(count==1)
               {
                  sum+=ar[i][j];
                  sum+=ar[i+1][j];
                  sum+=ar[i+2][j];
                  count++;
                      }
               
               
               
               else
               {
                  
                  count=0;
                  
                      }
               
             }       
          System.out.println();
           
        }
       
     
      }
   }
