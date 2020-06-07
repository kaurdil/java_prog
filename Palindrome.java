import java.util.Scanner;
public class Palindrome
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
     
    public void is_palin()
    {  
       Node start=head;
       
       String t="";
       int count=1;
       t+=Integer.toString(start.data);
       while(start.next!=null)
         {
           start=start.next;
           t+=Integer.toString(start.data);
          
         }
        String b="";
        Node prev=null;
        Node curr=head;
        Node Ne=head;
        while(curr!=null)
        {
          Ne=Ne.next;
          curr.next=prev;
          prev=curr;
          curr=Ne;
          }
        
        while(prev!=null)
         { 
            
            b+=Integer.toString(start.data);
            prev=prev.next;
            
           }
        if(t.equals(b))
          {
            System.out.println("palindrome");
            }
        else
            {
            System.out.println("not a palindrome");
            }
          
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
         Palindrome ll=new Palindrome();
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
            ll.is_palin();
         
         
         
              }


  }