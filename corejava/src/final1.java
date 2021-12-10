//final
class AP                    



{

 //final
 void m1()

 {

 System.out.println("super m1....");

 }

}

//overriding

class final1 extends AP

{

 final double pi;  //insatance variable
 
 final1()
 {
	 pi=3.14;  //instance block
	 System.out.println(pi);
 }

 void m1()

 {

 //pi=5.5;

 System.out.println("i am method");

 }

 public static void main(String[] args) {

 final1 ob =new final1();

 ob.m1();

 }

}