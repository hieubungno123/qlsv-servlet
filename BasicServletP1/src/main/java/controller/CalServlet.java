package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalServlet
 */
@WebServlet("/cal")
public class CalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    private String cal(double n1, double n2, String o) {
    	String rs="";
    	switch (o) {
			case "+": rs=n1+"+"+n2+"="+(n1+n2);
				break;
			case "-": rs=n1+"-"+n2+"="+(n1-n2);
				break;	
			case "*": rs=n1+"*"+n2+"="+(n1*n2);
				break;
			case ":": rs=n1+":"+n2+"="+(n1/n2);
			break;
		}
		return rs;
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String n1 = request.getParameter("num1");
		String n2 = request.getParameter("num2");
		String o = request.getParameter("op");
		double num1,num2;
		try {
			num1 = Double.parseDouble(n1);
			num2 = Double.parseDouble(n2);
			String rs = cal(num1,num2,o);
			out.println(rs);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
