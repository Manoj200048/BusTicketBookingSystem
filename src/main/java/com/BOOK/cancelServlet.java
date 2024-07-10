package com.BOOK;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cancelServlet")
public class cancelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
    	String userName = request.getParameter("un");
    	
    	
    	boolean isTrue;
    	
    	isTrue = BOOKDButil.validate(userName);
    	
    	if(isTrue == true) {
    		List<BOOK12> BookDetails = BOOKDButil.getBOOK(userName);
			request.setAttribute("BookDetails", BookDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);
    		
    		
    	}else {
    		out.println("<script type='text/javascript'>");
			out.println("alert('Your username is incorrect');");
			out.println("location='cancel.jsp'");
			out.println("</script>");
    		
    	}
    	
    	 
	
		
	}
    
    
}
