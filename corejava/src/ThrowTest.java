public class MyException extends Exception



{

 public MyException()

 {

 System.out.println("MyException ");



} }

 public MyException(String s)

 {

 super(s);

 }









public class ThrowTest

{

 public void disp(int age)throws MyException

 {

 if(age<0)

 {

 System.out.println("inside the if block");

 throw new MyException("U should not pass negative numbers...............");

 }

 else

 {

 System.out.println("value is "+age);

 }

 }//method

 public static void main(String[] args)throws MyException

 {

 ThrowTest td=new ThrowTest();

 td.disp(-5);

 System.out.println("end of p rg");

 }//main

}//class