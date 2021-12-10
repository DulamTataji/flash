
public class This1 {

 int i=5;

 String userName="kamalesh";

 void disp(int i,String userName)

 {

 this.i=i;

 this.userName=userName;

 }

 public static void main(String[] args) {

 This1 ob=new This1();

 System.out.println(ob.i+" "+ob.userName);

 ob.disp(10,"pankaj patil");

 System.out.println(ob.i+" "+ob.userName);

 }

}





