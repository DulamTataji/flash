 class exception2



{

 public static void main(String[] args)

 {

 int a=10,b;

 try

 {

 System.out.println("in the try block");

 b=Integer.parseInt(args[0]);

 int c;

 c=a/b;

System.out.println("c value is "+c);

System.out.println("end of try");

 }

 catch(ArithmeticException ae)

 {

 System.err.println("arithmetic error -catch block"+ae.getMessage());

 }

 catch(ArrayIndexOutOfBoundsException aioe)

 {

 System.err.println(aioe.toString());

 }

 catch(Exception e)

 {

 System.out.println(".........................");

 e.printStackTrace();

 }

 finally

 {

 System.out.println(" finally block");

 }

 System.out.println("end of the prg");

 }

}































































