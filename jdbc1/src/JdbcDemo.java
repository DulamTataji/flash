

import java.sql.Connection;

import java.sql.DriverManager;

public class JdbcDemo {

 public static void main(String[] args) throws Exception

 {

 Class.forName("oracle.jdbc.driver.OracleDriver");

 Connection con;

 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Tataji");

 if(con!=null)

 System.out.println(con);

 else

 System.out.println("connection not established");

 }

}











