package com.BOOK;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateSevlet")
public class updateSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String date = request.getParameter("D");
		String username = request.getParameter("un");
		
		
		boolean isTrue;
		
		isTrue = BOOKDButil.updatedate(date,username);
		
		if(isTrue == true) {
			
			List<BOOK12> Details = BOOKDButil.getBOOK(username) ;
			request.setAttribute("Details", Details);
			
			RequestDispatcher dis = request.getRequestDispatcher("userupdate.jsp");
			dis.forward(request, response);
		}
		else {
			List<BOOK12> Details = BOOKDButil.getBOOK(username);
			request.setAttribute("Details", Details);
			
			RequestDispatcher dis = request.getRequestDispatcher("userupdate.jsp");
			dis.forward(request, response);
		}
	}

}
