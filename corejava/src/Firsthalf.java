import java.util.Scanner;
public class Firsthalf {
	public static void main(String [] args)
	{
 Scanner sc =new Scanner (System.in);
 
 System.out.println("enter the string");
 
 String str=sc.nextLine();
 int length=str.length();
 
if(length%2==0)
{
 System.out.println(str.substring(0, str.length()/2));	
}
else
{
	System.out.println("null");
}
}
}
