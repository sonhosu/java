package son;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class calcul extends HttpServlet{
	
	
	protected void service(HttpServletRequest request, HttpServletResponse respone) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); 
		respone.setContentType("text/html;charset=utf-8"); 
		
		PrintWriter out = respone.getWriter();
		
		int x=Integer.parseInt(request.getParameter("x"));
		int y=Integer.parseInt(request.getParameter("y"));
		String op = request.getParameter("operator");
		
		if(op.equals("덧셈")) 
			out.println("result1:"+(x+y));
		else  
			out.print("result:"+(x-y));
		
		
		
	}
	
	
}
