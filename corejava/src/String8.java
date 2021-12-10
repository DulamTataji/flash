import java.util.Scanner;
public class String8
 {
 public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the String");
 String s=sc.next();sc.close();
 String[] arr=s.split("\\*");
 String res="";
 res+=arr[0].substring(0, arr[0].length()-1);
 res+=arr[1].substring(1, arr[1].length());
 System.out.println(res);
 }
}