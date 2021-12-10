import java.util.Scanner;
class Removestrings
     { 
   public static String 

    removeFirstandLast(String str) 

    { 
        str = str.substring(1, str.length() - 1); 
       return str; 

    } 
    public static void main(String args[]) 

     { 
    	Scanner sc= new Scanner(System.in);
    	String next="";
    	System.out.println("Enter the string"); 
    	String abc= sc.nextLine();
    	System.out.print(removeFirstandLast(abc));
    	
      }
   }