package GetSquare;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.apache.commons.math3.util.ArithmeticUtils;

@WebServlet("/square")
public class GetSquare extends HttpServlet implements Servlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	    response.getWriter().println("The square of " + request.getParameter("var") + " is " + ArithmeticUtils.pow(Integer.parseInt(request.getParameter("var")),2));
	    
	}

}
