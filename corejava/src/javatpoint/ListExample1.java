package javatpoint;
import java.util.*;  
public class ListExample1{  
public static void main(String args[]){  
 //Creating a List  
 List<String> list=new LinkedList<String>();  //list generics
 //Adding elements in the List  
 list.add("Mango");  
 list.add("Apple");  
 list.add("Banana");  
 list.add("Grapes");  

 
 /* //Iterating the List element using for-each loop  
 
 for(String fruit:list)  
  System.out.println(fruit);  
  */
 
 /*
 //for loop
 
 for(int i=0;i<list.size();i++)
	 System.out.println(list.get(i));
*/
 

 
 /*Iterator<String> itr =list.iterator();
 while(itr.hasNext())
 {
String obj=itr.next();
	 System.out.println(obj);
 }
 */
 
 
 System.out.println(list);

} } 