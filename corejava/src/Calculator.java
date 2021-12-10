class cal1
{
	
	static  double powerint(int num1,int num2)
	{
	
		return Math.pow(num1,num2);
	}
	static double powerdouble(double num1,int num2)
	{
		return Math.pow(num1,num2);
	}
	
}
public class Calculator {

	public static void main(String[] args) {
	
		cal1 ob=new cal1();
	System.out.println(	ob.powerint(4,6));
		System.out.println(ob.powerdouble(2.6,5));
		

	}

}
