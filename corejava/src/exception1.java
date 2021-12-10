 class exception1



{

 public static void main(String[] args)

 {

 int a=10,b=0,c=0;

 try

 {

 System.out.println("in the try block");

 c=a/b;

 }

 catch(ArithmeticException e)

 {

 //ae.printStackTrace();

 System.out.println("arithmatic error -catch block");

 }

 System.out.println("c value is "+c);

 System.out.println("end of the prg");

 }

}









































