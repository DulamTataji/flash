// Example on super.member

class Base

{

 int a,b;

 Base()

 {

 System.out.println("Base class cons.....");

 }

 void getData(int x,int y)

 {

 a=x;

 b=y;

 }

 void disp()

 {

 System.out.println("base class "+a+" "+b);

 }

}

class Der extends Base

{

 int a;

 int b;

 Der(int x)

 {

 System.out.println("sub class cons......."+x);

 }

 void assignData(int x,int y)

 {

 a=x;

 b=y;

 }

 void disp()

 {

  //super.disp();

 System.out.println("der class "+a+" "+b);

 int total=super.a+super.b+a+b;

 System.out.println("total is "+total);

 }

}//class

class super1

{

 public static void main(String args[])

 {

 Der d=new Der(222);

 d.getData(4,5);

 d.assignData(6,7);

 d.disp();

 }//main

}//class









