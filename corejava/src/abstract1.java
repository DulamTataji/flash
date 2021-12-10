abstract class T

{

 T()

 {

 System.out.println("abstract cons.....");

 }

 abstract void disp();

 void m1()

 {

 System.out.println("m1 method");

 }

}

class abstract1 extends T

{

 void disp()

 {

 System.out.println("disp method");

 }

 public static void main(String[] args)

 {

 abstract1 ob=new abstract1();

 ob.disp();

 ob.m1();

 }

}

