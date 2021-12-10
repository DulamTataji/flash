abstract class GeneralBank1 {
	

	public abstract double getSavingInterestRate();
	
	public abstract double getFixedInterestRate();

}



 class ICICIBank extends GeneralBank1 {


	public double getSavingInterestRate() {
		System.out.println("ICICI bank");
		return 4.0;
	}

	public double getFixedInterestRate() {
		return 8.5;
	}

}


class KotakBank extends GeneralBank1 {

	public double getSavingInterestRate() {
		System.out.println("kotak bank");
		return 6.0;
	}

	public double getFixedInterestRate() {
		return 9.0;
	}

}
class GeneralBank
{
	public static void main(String [] args)
	{
		
		KotakBank obj=new KotakBank();
		
	System.out.println(obj.getSavingInterestRate());	
	System.out.println(obj.getFixedInterestRate());
	
	ICICIBank obj1=new ICICIBank();
	
	System.out.println(obj1.getSavingInterestRate());	
	System.out.println(obj1.getFixedInterestRate());
	
	GeneralBank1 obj2=new KotakBank();
	
	System.out.println(obj2.getSavingInterestRate());	
	System.out.println(obj1.getFixedInterestRate());
	
	GeneralBank1 obj3=new ICICIBank();
	
	System.out.println(obj3.getSavingInterestRate());	
	System.out.println(obj3.getFixedInterestRate());
	
	}
}