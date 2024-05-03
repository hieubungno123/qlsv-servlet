package qlsv;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class svlSV
 */
@WebServlet("/svlSV")
public class svlSV extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public svlSV() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<SV> students = new ArrayList<>();

        // JDBC connection parameters
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        String url="jdbc:mysql://localhost:3306/qlsv"; // MySQL
	        String username="root"; 	
	        String userpass="Nguloz.123";
	
	        try (Connection connection = DriverManager.getConnection(url, username, userpass)) {
	            String query = "SELECT * FROM qlsv.sv";
	            try (Statement statement = connection.createStatement()) {
	                try (ResultSet resultSet = statement.executeQuery(query)) {
	                    while (resultSet.next()) {
	                        SV student = new SV();
	                        student.setMasv(resultSet.getString("MASV"));
	                        student.setTensv(resultSet.getString("TENSV"));
	                        student.setEmailsv(resultSet.getString("EMAILSV"));
	
	                        // Set other attributes as needed
	                        students.add(student);
	                    }
	                    resultSet.close();
	                }
	                statement.close();
	            }
	            connection.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
        }catch(Exception e){
           
            System.out.println(e.toString());
        }
        
        

        request.setAttribute("students", students);
        request.getRequestDispatcher("qlsv.jsp").forward(request, response);
    }
    

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		
		if("create".equals(action)) {
			// TODO Auto-generated method stub
			String parmasv=request.getParameter("parmasv").trim().toUpperCase();
			String parhodemsv=request.getParameter("parhodem").trim();
			String partensv=request.getParameter("partensv").trim();
			String partelsv=request.getParameter("partelsv").trim();
			String paremailsv=request.getParameter("paremailsv").trim();
			try {
				if((parmasv!=null && parmasv.length()>0) ||(partensv!=null && partensv.length()>0) || (parhodemsv!=null && parhodemsv.length()>0)  ){
					SV svobj = new SV();
					if(parmasv!=null && parmasv.length()>0) svobj.setMasv(parmasv);
					if(parhodemsv!=null && parhodemsv.length()>0) svobj.setHodem(parhodemsv);
					if(partensv!=null && partensv.length()>0) svobj.setTensv(partensv);
					if(partelsv!=null && partelsv.length()>0) svobj.setTelsv(partelsv);//System.out.println("partelsv="+partelsv);
					if(paremailsv!=null && paremailsv.length()>0) svobj.setEmailsv(paremailsv);
					svobj.themSV();
				}
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}else if("modify".equals(action)) {
			// TODO Auto-generated method stub
						String parmasv=request.getParameter("parmasv").trim().toUpperCase();
						String parhodemsv=request.getParameter("parhodem").trim();
						String partensv=request.getParameter("partensv").trim();
						String partelsv=request.getParameter("partelsv").trim();
						String paremailsv=request.getParameter("paremailsv").trim();
						try {
							if((parmasv!=null && parmasv.length()>0) ||(partensv!=null && partensv.length()>0) || (parhodemsv!=null && parhodemsv.length()>0)  ){
								SV svobj = new SV();
								if(parmasv!=null && parmasv.length()>0) svobj.setMasv(parmasv);
								if(parhodemsv!=null && parhodemsv.length()>0) svobj.setHodem(parhodemsv);
								if(partensv!=null && partensv.length()>0) svobj.setTensv(partensv);
								if(partelsv!=null && partelsv.length()>0) svobj.setTelsv(partelsv);//System.out.println("partelsv="+partelsv);
								if(paremailsv!=null && paremailsv.length()>0) svobj.setEmailsv(paremailsv);
								svobj.upadteSV();
							}
						} catch (Exception e) {
							System.out.println(e.toString());
						}
		}else if("delete".equals(action)) {
			// TODO Auto-generated method stub
			String parmasv=request.getParameter("parmasv").trim().toUpperCase();
			
			try {
				if((parmasv!=null && parmasv.length()>0)){
					SV svobj = new SV();
					if(parmasv!=null && parmasv.length()>0) svobj.setMasv(parmasv);
					
					svobj.deleteSV();
				}
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		

		doGet(request, response);
	}

}
