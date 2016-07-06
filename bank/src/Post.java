

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * Servlet implementation class Draw
 */
@WebServlet("/Post")
public class Post extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static private int money;

    /**
     * Default constructor. 
     */
    public Post() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=request.getParameter("id");
		
		Session s= DB.getSession();
		Transaction t=s.beginTransaction();
		
		if(id==null)
		{
			List all_posts = s.createCriteria(Posts.class).list();
			new ObjectMapper().writeValue(response.getOutputStream(), all_posts);
		}
		else
		{
			Object post = s.get(Posts.class,Integer.parseInt(id));
			new ObjectMapper().writeValue(response.getOutputStream(), post);
		}
		
		t.commit();
		s.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Posts post=new ObjectMapper().readValue(request.getInputStream(), Posts.class);
		
		Session s= DB.getSession();
		Transaction t=s.beginTransaction();
		s.saveOrUpdate(post);
		
		t.commit();
		s.close();
	}
	
	/**
	 * @see HttpServlet#doDelete(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		
		Session s= DB.getSession();
		Transaction t=s.beginTransaction();
		
		Object post = s.get(Posts.class,Integer.parseInt(id));
		new ObjectMapper().writeValue(response.getOutputStream(), post);
		s.delete(post);
		
		t.commit();
		s.close();
	}

}
