import java.io.*;
import java.util.Scanner;

public class CopyFile {
 
    public static void main(String args[])
    {	
        String srcfname, dstfname;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Source File Name: ");
        srcfname = scan.nextLine();
        System.out.print("Enter Destination File Name : ");
        dstfname = scan.nextLine();
        
    	InputStream inStream = null;
    	OutputStream outStream = null;

		
    	try
    	{
    	    File file1 =new File(srcfname); //creating an object of the file class
    	    File file2 =new File(dstfname);
 
    	    inStream = new FileInputStream(file1);
    	    outStream = new FileOutputStream(file2);
            byte[] buffer = new byte[1024];
 
    	    int len;
    	    while ((len = inStream.read(buffer)) > 0)
    	    {
    	    	outStream.write(buffer, 0, len);
    	    }
 
    	       inStream.close();
    	  
    	       outStream.close();
 
    	    System.out.println("File Copied!!");
          
        
    	}
    	catch(IOException e)
    	{
    		e.printStackTrace();
    	}
    }
}