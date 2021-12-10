/*class static1

{

 static

 {

 System.out.println("static block");

 }

 public static void main(String[] args)

 {

 System.out.println("Hello World!");

 }

 static

 {

 System.out.println("KKKKKKKKKKKKKKKKKK");

 }

}*/




//Example on static Variables

class static1

{

 int bid;

 int pscore;

static	int tscore;

static

 {

 tscore=0;

 System.out.println("hello");

 }

 void getRuns(int id ,int r)

 {

 bid=id;

 pscore=r;

 tscore=tscore+pscore;

 System.out.println("pscore is "+pscore);

 }

 static	void scoreBoard()

 {

 System.out.println(" team score is "+tscore);

 }//score Board

 public static void main(String[] args)

 {

 System.out.println("this is main");

 static1 sachin=new static1();

 sachin.getRuns(10,89);

 scoreBoard();

 static1 gangu=new static1();

 gangu.getRuns(2,4);

 static1.scoreBoard();

 }

}







