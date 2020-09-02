package com.projet.webapplication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet(name = "helloWorld", urlPatterns = { "/helloWorld" })
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       ValidPassword validPassword = new ValidPassword();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String login = request.getParameter("txtlogin");
		
		String password = request.getParameter("txtpassword");
		
		if(login == null) login = "";
		if(password == null) password = "";
		HttpSession session = request.getSession(true);
		session.setAttribute("login", login);
		session.setAttribute("password", password);
		
		request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        String login = request.getParameter("txtlogin");
		String password = request.getParameter("txtpassword");
		
		
		boolean valid = validPassword.isValid(login,password);
		if(valid) {
			HttpSession session = request.getSession(true);
			session.setAttribute("login", login);
			session.setAttribute("password", password);
			request.getRequestDispatcher("/WEB-INF/views/Bienvenue.jsp").forward(request, response);
		}else {
			request.setAttribute("error", "votre login ou votre mot de passe est incorrecte");

			request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);
			
		}
		
		
		
	}

}
