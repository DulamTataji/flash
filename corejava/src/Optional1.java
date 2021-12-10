import java.util.Optional;

public class OptionalExample {

  public static void main(String[] args) {

   String[] str = new String[10];

    str[0]="HELLO";

   //System.out.println(str[0].length());

    Optional<String> checkNull = Optional.ofNullable(str[0]);

    if(checkNull.isPresent()){ // check for value is present or not

      String lowercaseString = str[0].toLowerCase();

      System.out.print(lowercaseString);

    }else

      System.out.println("string value is not present");

  }

}







