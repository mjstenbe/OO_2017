
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet(description = "My First Servlet", urlPatterns = { "/Servlet" })
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Output text to the user

		PrintWriter writer = response.getWriter();
		writer.println("This is my <b>enhanced</b> output from server!<br>");

		// Get POST data from the form

		String fn = request.getParameter("firstName");
		String ln = request.getParameter("lastName");
		String email = request.getParameter("email");

		// Output data

		writer.println("Your name is: <b>" + fn + " " + ln + "</b><br>");
		writer.println("Your email is: <b>" + email + "</b>");

	}

}
