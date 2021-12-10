class TestBase

{

 TestBase()

 {

 System.out.println("base class constructor");

 }

 void m1()

 {

 System.out.println("m1 method.........");

 }

}

class inheritance1 extends TestBase //is-a relationship

{

  inheritance1()

 {

 System.out.println("der class Constructor");

 }

  void m2()

  {

   System.out.println("m2 method.......");

  }

 public static void main(String[] args)

 {

 System.out.println("before object creation");

 inheritance1 td=new inheritance1();

 td.m1();

 td.m2();

 }//main

}//class







