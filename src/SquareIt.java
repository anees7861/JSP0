import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//inherit httpservlet to make your class  servlet

@WebServlet(name = "SquareIt", urlPatterns = "/SquareIt")
public class SquareIt extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(req.getParameter("t1"));
		PrintWriter pw = resp.getWriter();//this class prints on the browser
		pw.print("Square " + (a*a));
	}
	

}
