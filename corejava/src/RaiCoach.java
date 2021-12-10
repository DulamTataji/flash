import java.util.Random;

abstract class Compartment
{
	public abstract String notice();
}

class FirstClass extends Compartment
{
	public String notice()
	{
		System.out.println("This is Firstclass compartment");
		return null;
	
	}

}
class Ladies extends Compartment
{
	public String notice()
	{
		System.out.println("This is Ladies compartment");
		return null;
	}
}

class General extends Compartment
{
	public String notice()
	{
		System.out.println("This is General compartment");
		return null;
		
	}
}

class Luggage extends Compartment
{
	public String notice()
	{
		System.out.println("This is Lugage compartment");
		return null;
	}
}

class RaiCoach
{
	public static void main (String[] args)
	{
	/*	FirstClass obj1 =new FirstClass();
		obj1.notice();
		
		Ladies obj2 =new Ladies();
		obj2.notice();
		
		General obj3=new General();
		obj3.notice();
		
		Luggage obj4=new Luggage ();
		obj4.notice();
		
		*/
		
		Compartment[] compartments = new Compartment[10];

		Random rand = new Random();
	    
	    for (int i = 0; i < 10; i++) {
	    	int randomNum = rand.nextInt((4 - 1) + 1) + 1;
	    	
	    	if (randomNum == 1)
	    		compartments[i] = new FirstClass();
	    	else if (randomNum == 2)
	    		compartments[i] = new Ladies();
	    	else if (randomNum == 3)
	    		compartments[i] = new General();
	    	else if (randomNum == 4)
	    		compartments[i] = new Luggage();
	    	
	    	compartments[i].notice();
	}

	
	}
}
	
	
	