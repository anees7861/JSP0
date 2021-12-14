import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Info", urlPatterns = "/Info")
public class Info extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("UserName");
		String email = req.getParameter("Email");
		String pass = req.getParameter("Password");
		PrintWriter pw = resp.getWriter();
		
		pw.print("Username is: " + name);
		pw.print("\nEmail is: " + email);
		pw.print("\nPassword is: " + pass);
		
	}
}
