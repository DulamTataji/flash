import java.util.Scanner;

public class concatenate2strings
{
   public static void main(String[] args)
   {
      String a, b;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the First String: ");
      a = scan.nextLine();
      System.out.print("Enter the Second String: ");
      b = scan.nextLine();

     a=a.concat(b);
     a=a.toLowerCase();
      System.out.println("After concatenation TWO STRINGS:"+a  );
      
   }
}