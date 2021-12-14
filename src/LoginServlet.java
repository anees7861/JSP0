import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginServlet", urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet{

	
	@Override
	// if we use doGet the url will contain important info such as password
	//to avoid this use the doPost method
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String user = req.getParameter("user");
		String pass = req.getParameter("pass");
		PrintWriter pw = resp.getWriter();
		if(user.equals("admin") && pass.equals("123"))
			pw.print("Welcome admin");
		else
			pw.print("Incorrect userid and pass");
			
	}	

}
