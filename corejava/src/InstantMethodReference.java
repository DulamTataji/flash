interface Sayable1{



 void say();

}

public class InstantMethodReference {

 public void saySomething(){

  System.out.println("Hello, this is non-static method.");

 }

 public static void main(String[] args) {

InstantMethodReference ob = new InstantMethodReference(); // Creating object

  // Referring non-static method using reference

   Sayable sayable = ob::saySomething;

  // Calling interface method

   sayable.say();

   // Referring non-static method using anonymous object

   Sayable sayable2 = new InstantMethodReference()::saySomething; // You can use anonymous object also

   // Calling interface method

   sayable2.say();

 }

}











































