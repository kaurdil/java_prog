import java.util.Scanner;
public class Find_middle
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
     
    public void find_mid()
    {
       Node first=head;
       Node second=head;
       while(second!=null && second.next!=null)
       {
         second=second.next.next;
         first=first.next;
           }
       System.out.println("midpoint is "+first.data);
         }
     public void insert(int ndata)
     {
       Node new_node=new Node(ndata);
       if(head==null)
        {
          head=new_node;
              }
       else
          new_node.next=head;
          head=new_node;
           }
     public void printin()
     {
       Node tnode=head;
       while(tnode!=null)
       {
          System.out.print(tnode.data+"->");
          tnode=tnode.next;
              }
         System.out.println();
       
      }
      public static void main(String[] args)
       {
         Find_middle ll=new Find_middle();
         Scanner input=new Scanner(System.in);
         System.out.println("enter length of your linked list:");
         int l=input.nextInt();
         System.out.println("enter list elements");
         for(int i=0;i<l;i++)
          {
            int el=input.nextInt();
            ll.insert(el);
            ll.printin();
              }
         ll.find_mid();
         
              }


  }