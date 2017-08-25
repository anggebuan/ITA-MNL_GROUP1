package servletPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TryServlet1
 */
@WebServlet("/TryServlet1")
public class TryServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public TryServlet1() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Helloooooo!" + "\n"  + "Helloooooo!");
		response.getWriter().println("Helloooooo!");
		
		  response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        out.println("<html>");
	        out.println("<head>");
	        out.println("<title>Hello World!</title>");
	        out.println("</head>");
	        out.println("<body bgcolor = yellow>");
	        out.println("<font color = green>");
	        out.println("<font style = 'Monotype Corsiva'>");
	        out.println("<h1>Hello World!</h1>");
	        out.println("</body>");
	        out.println("</html>");
	        
	        request.getRequestDispatcher("/WEB-INF/TryServlet.html").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
