import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Bufferreader1 {

 public static void main(String[] args) throws NumberFormatException, IOException {

 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

 System.out.println("Enter any no");

 int sno=Integer.parseInt(br.readLine());

 System.out.println("Enter student name");

 String name=br.readLine();

 System.out.println("Enter the fee");

 double fee=Double.parseDouble(br.readLine());

 System.out.println(sno+" "+name+" "+fee);

 }

}

















