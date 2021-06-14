package son;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add2")
public class AddSublet extends HttpServlet{
	
	
	protected void service(HttpServletRequest request, HttpServletResponse respone) throws ServletException, IOException {
		
		PrintWriter out = respone.getWriter();
		
		String num_[] =request.getParameterValues("num");
		String y_ =request.getParameter("y");
		
		int result= 0;
		for(int i=0; i<num_.length; i++) {
			int num=Integer.parseInt(num_[i]);
			result+=num;
		}
		out.print("result:"+result);
		
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
	}
}
