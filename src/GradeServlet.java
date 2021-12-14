import java.io.IOException;
import java.io.PrintWriter;
import javax.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "GradeServlet", urlPatterns = "/GradeServlet")
public class GradeServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int s1 = Integer.parseInt(req.getParameter("s1"));
		int s2 = Integer.parseInt(req.getParameter("s2"));
		int s3 = Integer.parseInt(req.getParameter("s3"));
		int total = s1 + s2 + s3;
		float per = (total*100) / 300;
		PrintWriter pw = resp.getWriter();
		
		pw.print("Percentage is " + per);
		
		if(per >= 50)
			pw.print("\nYou have passed");
		else
			pw.print("\nYou have failed");
			
	}

}
