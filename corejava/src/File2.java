/*import java.io.FileInputStream;

public class File2 {

   public static void main(String args[]){

     try{

      int i;

      FileInputStream fin=new FileInputStream("ab.txt");

      while( (i=fin.read())!=-1)

      System.out.print((char)i);

      fin.close();

     }catch(Exception e){System.out.println(e);}

     }

    }         





import java.io.*;

public class File2 {

  public static void main(String[] args) throws IOException

  {

      Writer w = new FileWriter("abcd.txt");

      String content = "I love my country.......";

      w.write(content);

      w.append('A');

      w.close();

      System.out.println("Done");

  }

}  
*/

  import java.io.*;

public class File2 {

  public static void main(String[] args) throws Exception

  {

      Reader reader = new FileReader("abcd.txt");

      int data ;

      while ((data=reader.read()) != -1) {

        System.out.print((char) data);

      }

      reader.close();

  }

}  














