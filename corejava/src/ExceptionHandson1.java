/*1) Get an input String from user and parse it to integer, if it is not a number it will throw number format exception Catch it and print "Entered input is not a valid format for an integer." or else print the square of that number. (Refer Sample Input and Output).

Sample input and output 1:

Enter an integer: 12

The square value is 144

The work has been done successfully

Sample input and output 2:

Enter an integer: Java

Entered input is not a valid format for an integer.*/
import java.util.Scanner;

class ExceptionHandson1
{
	public static void main(String [] args)
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter a number");
		
		String str1=sc.nextLine();
		
		sc.close();
		try
		{
			int num1=Integer.parseInt(str1);
			System.out.println(num1*num1);
			
		}
		catch(NumberFormatException e)
		
		{
			System.out.println("Entered input is not a valid format for an integer");
			e.printStackTrace();//The printStackTrace() method of Java Throwble class is used to print the Throwable along with other details like classname and line number where the exception occurred.
		}
		
		
	  System.out.println("i can executed even  error also");
	}
}