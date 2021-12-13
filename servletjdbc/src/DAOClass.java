
import java.sql.*;
public class DAOClass {
 public Connection getConnection()throws Exception
 {
 Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "Tataji");
 return conn;
 }
 public boolean getLogin(String uname,String pass)
 {
 boolean b=false;
 try {
 PreparedStatement ps=getConnection().prepareStatement("select *from login where uname=? and pass=?");
 ps.setString(1, uname);
 ps.setString(2, pass);
 ResultSet rs=ps.executeQuery();
 if(rs.next()) {
 b= true;
 }
 } catch (Exception e) {
  // TODO: handle exception
 }
 return b;
 }
}

