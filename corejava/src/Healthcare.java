
class patient
{
	String name;
	double weight,height;
	
	double computebmi(double w,double h)
	{   
		weight =w;
		height=h;
		
	
	double	result=w/(h*h);
		return result;
	}
}
public class Healthcare {
	public static void main(String args[])
	{
		patient ob=new patient();
System.out.println(ob.computebmi(68.5,5.11));
	}

}

