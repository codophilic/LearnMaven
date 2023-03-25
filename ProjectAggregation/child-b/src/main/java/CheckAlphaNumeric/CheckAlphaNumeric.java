package CheckAlphaNumeric;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

@WebServlet("/check")
public class CheckAlphaNumeric extends HttpServlet implements Servlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (StringUtils.isAlphanumeric(request.getParameter("var"))){
			response.getWriter().println("Yes its alphanumeric");
		}
		else {
			response.getWriter().println("No its not alphanumeric");
		}
	}

}
