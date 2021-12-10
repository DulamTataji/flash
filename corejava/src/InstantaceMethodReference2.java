public class InstantaceMethodReference2 {



 public void printnMsg(){

  System.out.println("Hello, this is instance method");

 }

 public static void main(String[] args) {

 Thread t2=new Thread(new InstantaceMethodReference2()::printnMsg);

  t2.start();

 }

}

















