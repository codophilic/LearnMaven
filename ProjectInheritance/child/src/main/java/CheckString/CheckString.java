package CheckString;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import org.apache.commons.lang3.math.NumberUtils;


@WebServlet("/check")
public class CheckString extends HttpServlet implements Servlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String s = request.getParameter("var");
		if(NumberUtils.isCreatable(s)) {
			response.getWriter().println("Its a Number");
			
		}
		else {
			response.getWriter().println("It is not a Number");
		}
		
	}

}
