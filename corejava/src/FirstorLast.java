
import java.util.Scanner;
public class FirstorLast {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
				
				System.out.println("enter the string");
				
		String str = sc.nextLine();
		
		if (str.charAt(0) == 'x')
			str = str.substring(1, str.length());
		
		if (str.charAt(str.length() - 1) == 'x')
			str = str.substring(0, str.length() - 1);
		
		System.out.println(str);

	}

}