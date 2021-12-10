import java.util.Scanner;



public class scanner {

 public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

System.out.println("Enter Employee number");

 int eno=sc.nextInt();

 sc.nextLine();

 System.out.println("Enter the employee name");

 String ename=sc.nextLine();

 System.out.println("enter the employee salary");

 double sal=sc.nextDouble();

 System.out.println(eno+" "+ename+" "+sal);

 }

}





