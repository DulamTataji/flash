package javatpoint;

import java.util.*;



public class CollectionDemo{
public static void main(String[] args)
{
	List <Integer> values =new ArrayList <>();
	values.add(345);
	values.add(53);
	values.add(56);

	Collections.sort(values);
	Collections.reverse(values);
	Collections.shuffle(values);
	
	for(Integer o: values)
	{
		System.out.println(o);
	}
	
	
		
}
}
