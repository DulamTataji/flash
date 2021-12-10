import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.ObjectInputStream;

import java.io.ObjectOutputStream;

import java.io.Serializable;



public class Serialization {

 public static void main(String[] args) throws Exception

 {

 Student ob=new Student(10,"Vijay",10000);

 //serialization

 FileOutputStream fos=new FileOutputStream("abc.txt");

 ObjectOutputStream oos=new ObjectOutputStream(fos);

 oos.writeObject(ob);

 oos.flush();

 oos.close();

 //deserialization

 FileInputStream fis=new FileInputStream("abc.txt");

 ObjectInputStream ois=new ObjectInputStream(fis);

 Student s=(Student)ois.readObject();

 System.out.println(s.sno+" "+s.name+" "+s.fee);

 }

}

class Student implements Serializable

{

 int sno;

 transient String name;

 double fee;

 public Student(int sno, String name,double fee) {

 this.sno = sno;

 this.name = name;

 this.fee=fee;

 }

}