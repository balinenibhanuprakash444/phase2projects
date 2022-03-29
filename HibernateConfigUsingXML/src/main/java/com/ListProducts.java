package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.websocket.Session;

import com.ecommerce.EProduct;
import com.ecommerce.HibernateUtil;
import com.mysql.cj.xdevapi.SessionFactory;

import java.io.Serializable;
import java.util.List;
/**
 * Servlet implementation class ListProducts
 */
@WebServlet("/ListProducts")
public class ListProducts extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EProduct[] list;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListProducts() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 try {
             SessionFactory factory = HibernateUtil.getSessionFactory();
             
            // Session session = (("factory") factory).openSession();            // using HQL
             //List<EProduct> list = session.createQuery("from EProduct").list();
             
             //session.close();
             
              PrintWriter out = response.getWriter();
              out.println("<html><body>");
              out.println("<b>Product Listing</b><br>");
              for(EProduct p: list) {
                      out.println("ID: " + String.valueOf(p.getID()) + ", Name: " + p.getName() +
                                      ", Price: " + String.valueOf(p.getPrice()) + ", Date Added: " + p.getDateAdded().toString() + "<br>");
              }
              
          out.println("</body></html>");
          
          
      } catch (Exception ex) {
              throw ex;
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
