
public class Lastthree {
	public static void main (String [] args)
	{
	public String repeatEnd(String str, int n);
	
		String sol;
		if(n==0)
		{
		return "";
		}
		else if(n==3)
		{
		sol=str.substring(str.length()-3)+str.substring(str.length()-3)+
		str.substring(str.length()-3);
		return sol;
		}

		else if(n==2)
		{
		sol=str.substring(str.length()-2)+str.substring(str.length()-2);
		return sol;
		}
		return str.substring(str.length()-1);
		}
}
