import java.io.*;

class employee implements Serializable
{
	String name;
	int num;
	

employee(String name,int num)
{
	this.name=name;
	this.num=num;
}
}
public class Serialization1 {
	public static void main (String[] arg)
	{
		employee obj=new employee("tarun",9);
		try
		{
		FileOutputStream fos=new FileOutputStream("D://tata.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
	
		oos.writeObject(obj);
		oos.close();
		fos.close();
		System.out.println("success");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
