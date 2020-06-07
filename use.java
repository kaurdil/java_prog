import java.util.Scanner;
class DeleteSL
{
  Node head;
  class Node  
   {
    Node next;
    int data;
    Node(int d)
    {
      data=d;
    }

   }
   public void insertATF(int no)
    {
      Node new_node=new Node(no);
      if(head==null)
      {
        head=new Node(no);
        return;
        
      }
      new_node.next=head;
      head=new_node;
    }
   public void delete(int no)
    {
      if(head==no)
       {
         head=head.next;
         }
      elseif(head==null)
       { 
         System.out.println("no doesnot exist");
         }
       Node temp=head;
       while(temp.next.data!=no)
       {
         temp=temp.next;
       }
       temp.next=temp.next.next;
    }
  public static void main(String[] args)
  { 
    DeleteSL s=new DeleteSL();
    Scanner input=new Scanner(System.in);
    String data=new String();
    System.out.println("Enter element"); 
    while(data!="")
     {
        data=input.nextLine();
        int no=Integer.parseInt(data);
        s.insertATF(no);
        s.printin();
      }
    System.out.println("enter no to be deleted");
    do
    {
    int del=input.nextInt();
    s.delete(del); 
    }while(del!=0);
   }
}