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
      if(head.data==no)
       {
         head=head.next;
         }
      /*elseif(head==null)
       { 
         System.out.println("no doesnot exist");
         }*/
      Node temp=head;
      while(temp.next.data!=no)
       {
         temp=temp.next;
       }
       temp.next=temp.next.next;
    }
    void printin()
     { 
        Node n=head;
       
       System.out.println("Insertion:");
       while(n!=null)
       {

       System.out.print(n.data+"->");
       n=n.next;
       }
       System.out.println("");
      }
      
  public static void main(String[] args)
  { 
    DeleteSL s=new DeleteSL();
    Scanner input=new Scanner(System.in);
    int data=1;
    System.out.println("Enter element"); 
    while(data!=0)
     { 
       if(data==0)
        {
          break;
        }
       else
          data=input.nextInt();
          s.insertATF(data);
          s.printin();
      }
    
    int del=1;
    while(del!=0)
    {
     System.out.println("enter no to be deleted");
     del=input.nextInt();
     s.delete(del); 
     s.printin();
    }
   }
}