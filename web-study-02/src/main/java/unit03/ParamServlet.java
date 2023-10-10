package unit03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ParamServlet")
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset = utf-8"); 
		
		String id = request.getParameter("id");
		String age = request.getParameter("age");
		
		PrintWriter out = response.getWriter();
		out.println("이름 :" + id + "<br>");
		out.println("나이 :" + age + "<br>");
		
		out.close();
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); // post 방식에서 기입
		
		doGet(request, response);
		
		
		}

}
