

/*import java.util.*;

class handson1
{
	public static void main (String args [])
	{
		
		
		Scanner sc =new Scanner (System.in);
		
		System.out.println("enter the firsr charcter");
		 
		char a=sc.next().charAt(0);
		
		System.out.println("enter the second charcter");
		
		char ab =sc.next().charAt(0);
		
		if(a>ab)
		{
			System.out.println(ab +"," + a);
			
		}
		
		
		else
		{
			System.out.println(a+","+ab);
		}
			
		
	}
	
}*/


/*import java.util.*;
class handson1
{
	public static void main (String args[])
	{
		
		Scanner sc =new Scanner(System.in);
		
	System.out.println(" enter any charcter");
	
	char c=sc.next().charAt(0);

			
			
		
			
			
			if ((c>'a'&&c<='z') ||(c>'A' && c<='Z') )
			{
				System.out.println("alphabet");
			}
			else if(c>='0' && c<='9')
			{
				System.out.println("digit");
			}
	}
	
}*/


/*import java.util.*;
class handson1
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter any charcter");
		char c=sc.next().charAt(0);
int i;
		
		if(c>='a'&&c<='z') {
		System.out.println(c+"->");
		i=(int)c;
		c=(char)(i-32);
		System.out.println(c);
		}
		
		else {
			System.out.println(c+"->");
		    i=(int)c;
			c=(char)(i+32);
			System.out.println(c);
		}
	}*/


/* import java.util.*;
public class handson1 {

	public static void main(String[] args) 
{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number of month");
		
		int m=sc.nextInt();
         sc.close();
		switch(m){
		case 1 : System.out.println("January");
		break;
		case 2 : System.out.println("February");
		break;
		case 3 : System.out.println("March");
		break;
		case 4 : System.out.println("April");
		break;
		case 5 : System.out.println("May");
		break;
		case 6 : System.out.println("June");
		break;
		case 7 : System.out.println("July");
		break;
		case 8 : System.out.println("August");
		break;
		case 9 : System.out.println("September");
		break;
		case 10 : System.out.println("October");
		break;
		case 11 : System.out.println("November");
		break;
		case 12 : System.out.println("December");
		break;
		default : System.out.println("Invalid Month");
	    }

	}
}    */



/*

class handson1
{
	public static void main(String args[])
	{
		for(int i=1;i<=10; i++)
		{
			System.out.print("    "+i);
			
		}
		
	}
}

*/



/*
class handson1
{
	public static void main(String args[])
	{
		for(int i=23;i<=57;i++)
		{
			if(i%2==0)
			{
			System.out.println(i);
			}
		}
	}
}
	*/



/*import java.util.*;
class handson1{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the color code");
		
		char c ='O';
			
		switch(c){

		case 'R' : System.out.println("R->Red");
		break;

		case 'B' : System.out.println("B->Blue");
		break;

		case 'G' : System.out.println("G->Green");
		break;

		case 'O' : System.out.println("O->Orange");
		break;

		case 'Y' : System.out.println("Y->Yellow");
		break;

		case 'W' : System.out.println("W->White");
		break;

		default : System.out.println("Invalid Code");

	    }		

	}

}*/













/*public class handson1{
   public static void main(String args[]) {
      int i, m = 0, flag = 0;
      int n = 41;// it is the number to be checked
      m = n / 2;
      if (n == 0 || n == 1) {
         System.out.println(n + " not a prime number");
      } else {
         for (i = 2; i <= m; i++) {
            if (n % i == 0) {
               System.out.println(n + " not a prime number");
               flag = 1;
               break;
            }
         }
         if (flag == 0) {
            System.out.println(n + " is a prime number");
         }
      }
   }
}*/








class handson1
{
   public static void main (String[] args)
   {		
       int i =0;
       int num =0;
       //Empty String
       String  UniqNoDemo = "";

       for (i = 10; i <= 99; i++)         
       { 		  	  
          int myFlag=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		myFlag = myFlag + 1;
	     }
	  }
	  if (myFlag ==2)
	  {
	     //Appended the Prime number to the String
	     UniqNoDemo = UniqNoDemo + i + " ";
	  }	
       }	
       System.out.println("Prime numbers from 1 to 100 are :");
       System.out.println(UniqNoDemo);
   }
}

