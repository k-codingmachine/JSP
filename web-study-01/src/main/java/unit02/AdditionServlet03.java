package unit02;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Add03")
public class AdditionServlet03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = 20;
		int num2 = 10;
		
		int add = num1 + num2;
		
		request.setAttribute("A", num1);
		request.setAttribute("B", num2);
		request.setAttribute("sum", add);
		request.setAttribute("msg", "doGet방식으로");
		
		RequestDispatcher dis = request.getRequestDispatcher("addition03.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = 20;
		int num2 = 10;
		
		int sub = num1 - num2;
		
		request.setAttribute("A", num1);
		request.setAttribute("B", num2);
		request.setAttribute("sum", sub);
		request.setAttribute("msg", "doPost방식으로");
		
		RequestDispatcher dis = request.getRequestDispatcher("addition03.jsp");
		dis.forward(request, response);
	}

}
