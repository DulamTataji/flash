

class Student implements Comparable<Student> {

 public String name;

 public Student(String name) {

  this.name = name;

 }

 public int compareTo(Student person) {

  return name.compareTo(person.name);

 }

}  



import java.util.*;

public class TestSort {

 public static void main(String[] args) {

   List<Student> al=new ArrayList<>();

   al.add(new Student("Viru"));

   al.add(new Student("Saurav"));

   al.add(new Student("Mukesh"));

   al.add(new Student("Tahir"));

  Collections.sort(al);

  for (Student s : al) {

   System.out.println(s.name);

  }

 }

}  










