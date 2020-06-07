import java.util.Scanner;

class NoMatchException extends Exception
{
  public NoMatchException(String message)
  {
    super(message);
  }
}

class StringMatch
{
  public void GetWord(String str) throws NoMatchException
  {
    if (!"India".equals(str))
    {
      throw new NoMatchException("entered String is not India");
    }
    else
    {
      System.out.println("String Matched!!");
    }
  }
}
 class CheckString
{
  public static void main(String[] args)
  {
    String st;
    int count=0;
    StringMatch s = new StringMatch();
    Scanner scan = new Scanner(System.in);
    do
   {    
    System.out.print("Enter your string: ");
    st = scan.nextLine();
    count++;
    try
    {
      
       s.GetWord(st);
      
    }
    catch (NoMatchException e)
    {
      
      e.printStackTrace();
    }
 }while(count!=2); //checking at least two string enteries.
  }
}
