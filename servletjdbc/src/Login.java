import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
 @WebServlet("/servlet1")
public class Login extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
  response.setContentType("text/html");
  PrintWriter out = response.getWriter();
  String n=request.getParameter("userName");
  String p=request.getParameter("userPass");
  DAOClass ob=new DAOClass();
  boolean b=ob.getLogin(n, p);
  if(b){
    RequestDispatcher rd=request.getRequestDispatcher("servlet2");
    out.println("Login.............");
    rd.forward(request, response);
  }
  else{
    out.print("Sorry UserName or Password Error!");
    RequestDispatcher rd=request.getRequestDispatcher("/index.html");
    rd.include(request, response);
    }
  }
}
