import java.util.Scanner;
public class Length_singll
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
     
     public void find_length()
     {
       Node temp=head;
       int count=1;
       while(temp.next!=null)
        {
          temp=temp.next;
          count++;
             }
       System.out.println("length is:"+count);
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
       
      }
      public static void main(String[] args)
       {
         Length_singll ll=new Length_singll();
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
         ll.find_length();
         
              }


  }