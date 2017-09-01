package summerProject;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SummerProject/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RegisterController() {
        super();
    }


	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		ArrayList<User> registeredUsers = new ArrayList<User>();
		
		registeredUsers.add(new User("Kristen Admin", "kristenmarenco@gmail.com", "AdminKristen", "abcd", "abcd"));
		
		getServletContext().setAttribute("registeredUsers", registeredUsers);
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String name = (String)session.getAttribute("name");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/SummerProject/RegisterElisa.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

}
