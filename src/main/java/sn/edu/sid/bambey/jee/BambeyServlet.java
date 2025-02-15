/**
 * 
 */
package sn.edu.sid.bambey.jee;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/bambeyservlet")
public class BambeyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 //Recuperer les inputs du formulaires
		 String lastName = req.getParameter("lastname");
		 //Valider si possible si l'on a plusieurs inputs parseInt, parseXXXXX
		 //Traiter les données
		 PrintWriter out = resp.getWriter();
		 out.println("Votre nom est:"+lastName);
		 //Proposer la réponse à l'utilisateur
		 //resp.sendRedirect("list");
	    }
}
