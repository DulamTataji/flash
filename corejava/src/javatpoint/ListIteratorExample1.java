package javatpoint;
import java.util.*;  
public class ListIteratorExample1{  
public static void main(String args[]){  
List<String> al=new ArrayList<String>();    
        al.add("Amit");    
        al.add("Vijay");    
        al.add("Kumar");    
        al.add("Sachin");    
      /*  ListIterator<String> itr=al.listIterator();    
        System.out.println("Traversing elements in forward direction");    
        while(itr.hasNext()){    
              
        System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());    
        }    
        System.out.println("Traversing elements in backward direction");    
        while(itr.hasPrevious()){    
          
        System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());  
        
        } */   
    
      /*  for(String s:al)
       System.out.println(s);  */
        
        for(int i=0;i<al.size();i++)
        {
        	 System.out.println(i);//for index only 
            System.out.println(al.get(i)); //for elementss
        }
}
}