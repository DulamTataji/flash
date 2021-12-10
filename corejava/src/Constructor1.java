class Account

{

 int acid;

 String branch;

 float bal;

 //constructor

 Account()

 {
this("mumbai",4242);
 acid=11;

 System.out.println("Zero -arg constructor");

 branch="hyderabad";

 bal=250;

 }

 Account(String br,float tbal)

 {

 System.out.println("param constructor");

 branch=br;

 bal=tbal;

 }

 

 void getDetails(int x,String y,float z)

 {

 acid=x;

 branch=y;

 bal=z;

 }

 void putDetails()

 {

System.out.println(acid+" "+branch+" "+bal);

 }

}//class

class Constructor1

{

 public static void main(String args[])

 {

 Account a1=new Account();

 a1.putDetails();

 a1.getDetails(101,"ameer pet",7800);

 a1.putDetails();

 Account a2=new Account("s.r",750);

 a2.putDetails();

 a2.getDetails(13,"s.r",6789);

 a2.putDetails();

 

 }//main

}//class













