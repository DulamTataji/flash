import java.io.File;

import java.io.FileNotFoundException;

import java.io.PrintWriter;

public class PrintWriterDemo {

 public static void main(String[] args) throws FileNotFoundException {

 PrintWriter out=new PrintWriter(System.out);

 out.print("Hello...........");

 out.flush();

 out.close();

 

 File file=new File("testout.txt");

 PrintWriter writer1 = new PrintWriter(file);

    writer1.write("......Like Java, Spring, Hibernate, Android, PHP etc.");

            writer1.flush();

    writer1.close();

    System.out.println("success.....");

 }

}

















