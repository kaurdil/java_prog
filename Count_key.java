import java.util.Scanner;
public class Count_key
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
     
    public void count_key(int key)
    {
       Node temp=head;
       int count=0;
       while(temp!=null)
        {
          if(temp.data==key)
           {
            count++;
                 }
          else
           {
             temp=temp.next;
                }
        }
        System.out.println("count="+count);
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
         Count_key ll=new Count_key();
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
         System.out.println("enter key element");
         int h=input.nextInt();
         ll.count_key(h);
         
              }


  }