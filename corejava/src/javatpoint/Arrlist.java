package javatpoint;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
public class Arrlist {

	public static void main(String[] args) {
	
		 ListIterator litr = null;
		ArrayList arrlist=new ArrayList();
		arrlist.add("Sunday");
		arrlist.add("Monday");
		arrlist.add("Tuesday");
		arrlist.add("Wednesday");
		arrlist.add("Thursday");
		arrlist.add("Friday");
		arrlist.add("Saturday");
		
		//using for loop 
       System.out.println("Using For Loop\n ");
	      for (int i = 0; i < arrlist.size();i++) 
	      { 		      
	          System.out.println(arrlist.get(i)); 		
	      }   		
		
		//using for-each loop
	      System.out.println("\nUsing for-each loop\n");		
	      for (String str : arrlist)
	      { 		      
	           System.out.println(str); 		
	      }

	      //using iterator
	      System.out.println("\nUsing Iterator");
	      Iterator itr=arrlist.iterator();
	      while(itr.hasNext())
	        {
	          String obj = itr.next();
	          System.out.println(obj);
	        }
	    //Using list iterator
	      litr=arrlist.listIterator();
	   
	      System.out.println("\n Using list iterator");
	      while(litr.hasNext()){
	         System.out.println(litr.next());
	      }
	      
	}

}