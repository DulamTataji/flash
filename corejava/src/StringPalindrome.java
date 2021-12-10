import java.util.Scanner;
 
class StringPalindrome
{
   public static void main(String args[])
   {
      String str, res = "";
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Enter a string:");
      str = sc.nextLine();
 
      int length = str.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         res = res + str.charAt(i);
 
      if (str.equals(res))
         System.out.println(str+" is a palindrome");
      else
         System.out.println(str+" is not a palindrome");
 
   }
}