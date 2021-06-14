package son;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc2")
public class calcul2 extends HttpServlet{
	
	
	protected void service(HttpServletRequest request, HttpServletResponse respone) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); 
		respone.setContentType("text/html;charset=utf-8"); 
		ServletContext application = request.getServletContext();
		PrintWriter out = respone.getWriter();
		String op = request.getParameter("operator");
		int v=Integer.parseInt(request.getParameter("v"));
		if(op.equals("=")) {
			
			int x= (Integer) application.getAttribute("value");
			int y=v;
			String operator = (String) application.getAttribute("op");
			int result = 0;
			
			if(operator.equals("+")) 
				result= x+y;
			else
				result= x-y;
			
			respone.getWriter().printf("result is %d\n", result);
		}
			
		else {
			application.setAttribute("value", v);
			application.setAttribute("op", op);
		}
		
		
		
	}
	
	
}
