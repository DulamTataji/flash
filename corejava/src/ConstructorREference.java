interface Messageable{

  Message getMessage(String msg);

}

class Message{

  Message(String msg){

    System.out.print(msg);

  }

}

public class ConstructorREference {

  public static void main(String[] args) {

    Messageable ob = Message::new;

    ob.getMessage("Hello");

  }

}

