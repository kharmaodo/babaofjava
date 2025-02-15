package sn.edu.sid.bambey.jee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sn.edu.sid.bambey.Human;

@WebServlet("/bambeylistservlet")
public class BambeyListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Appel la source de données 
		 BambeyModel model =new BambeyModel();
		 List<Human> listOfStudents = model.getStudents();
		 PrintWriter out = resp.getWriter();
		 resp.setCharacterEncoding("UTF-8");
		 //Proposer la réponse à l'utilisateur
		 listOfStudents.forEach(s->out.println(s.lastName() +""+s.firstName()));
	    }
}
