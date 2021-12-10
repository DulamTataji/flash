class exception4{



 void m(){

  int data=50/0;

 }

 void n(){
	 System.out.println("tataji");

  m();

 }

 void p(){

  try{

  n();

  }catch(Exception e){

  System.out.println("exception handled");}

 }

 public static void main(String args[]){

 exception4 obj=new exception4();

  obj.p();

  System.out.println("normal flow...");

 }

}  

