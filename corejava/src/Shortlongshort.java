
import java.util.Scanner;
public class Shortlongshort {
	public static void main (String [] args)
	{
      String a, b;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the short String: ");
      a = scan.nextLine();
      System.out.print("Enter the long String: ");
      
      b = scan.nextLine();
     a=a.concat(b+a);
    
      System.out.println("After short+long+short STRINGS:"+a  );
      
   }
}

