import java.util.Scanner;

public class Anagram {


    static boolean isAnagram(String a, String b) {
        int l1=a.length();
        int l2=b.length();
        if(l1==l2)
        {
           for(int i=0;i<l1;i++)
             {    int c1=0;
                  int c2=0;
                 for(int j=0;j<l1;j++)
                  {
                      if(a.charAt(i)==a.charAt(j))
                       {
                           c1++;
                       }                    
                  }
                  for(int k=0;k<l2;k++)
                  {
                      if(a.charAt(i)==b.charAt(k))
                       {
                           c2++;
                       }
                  }
                  if(c1==c2)
                   {
                       continue;
                   }
                   else return false;
             }
             return true;
        }
        else
           {
              return false;
              }
    }

    public static void main(String[] args) {
    
        //Scanner scan = new Scanner(System.in);
        String a = "anagram";
        String b = "marga";
        //scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}