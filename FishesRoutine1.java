package com.jp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FishesRoutine1
 */
public class FishesRoutine1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FishesRoutine1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out=response.getWriter();
			response.setContentType("text/html");
			Map<String, Integer> fishFeedTime = new HashMap<String, Integer>();
			String species = request.getParameter("species");
			String fishName = request.getParameter("fishName");
			fishFeedTime.put("Gold", 2);
			fishFeedTime.put("Silver", 4);
			fishFeedTime.put("Diamond", 6);
			fishFeedTime.put("Platinum", 8);
			for (Map.Entry<String, Integer> entry : fishFeedTime.entrySet()){
			    String key=entry.getKey(); 
			    Integer value=entry.getValue();
			    Integer feedTimePerDay = 24/value;
			    if(key.equals(species)){
			    	out.println("<html><body background=img1.jpg>");
			    	out.println("<h1>Fish "+fishName+" feeds "+feedTimePerDay+" times per day</h1><br>");
			    }
			}
			out.println("<h1>For your information:</h1><br>");
			for (Map.Entry<String, Integer> entry : fishFeedTime.entrySet()){
			    String key=entry.getKey(); 
			    Integer value=entry.getValue();
			    Integer feedTimePerDay = 24/value;
		    	out.println("<h1>Fish species "+key+" feeds "+feedTimePerDay+" times per day</h1><br>");
			}
			out.println("<h1>Thank You</h1></body></html>");
		}

	

	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
