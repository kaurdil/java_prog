import java.util.Scanner; 
 
public class p_sq 
{
    
    public static double sqroot(int n) 
    {
	double temp;
	double sr = n/2;
	do 
	{
		temp = sr;
		sr = (temp + (n / temp)) / 2;
	} while ((temp - sr) != 0);
	return sr;
    }
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in); 
    	System.out.print("\n Enter Number: ");
	int n = s.nextInt();

        if(n==0 || n==1)
	{
		System.out.println("\n  " + n + " is a perfect square!");
		System.exit(0);		
	}
	else if(n<0)
	{
		System.out.println("\n Invalid Input!");
		System.exit(0);		
	}
        if( sqroot(n) == (int)sqroot(n) )
        	System.out.println("\n  " + n + " is a perfect square!");
        else 
        	System.out.println("\n  " + n + " is NOT a perfect square!");
    }
}