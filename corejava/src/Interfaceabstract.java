interface x
{
	default void ta()

{
	System.out.println("default method");
}

}
class z implements x
	{
		void ja()
		{
			System.out.println("ja");
		}
	}

public class Interfaceabstract {
	public static void main(String [] args)
	{
		z ob=new z();
		
		ob.ta();
        ob.ja();
	}

}



