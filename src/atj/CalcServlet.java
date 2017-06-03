package atj;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		CalcModel obiekt = (CalcModel) session.getAttribute("calcModel");
	    if(obiekt == null) {
	        obiekt = new CalcModel();
	        session.setAttribute("calcModel",obiekt);
	    }
	    
	    if(request.getParameterMap().containsKey("btn")) 
	          if( request.getParameter("btn").equals("Clear")) {
	        	  obiekt.setInput("");
	        	  obiekt.setEnabled(true);
	          }
	    
	    if(request.getParameterMap().containsKey("btn")) 
	          if( request.getParameter("btn").equals("0") && obiekt.isEnabled()) {
	        	  obiekt.addInput("0");
	          }
	    
	    if(request.getParameterMap().containsKey("btn")) 
	          if( request.getParameter("btn").equals("1") && obiekt.isEnabled()) {
	        	  obiekt.addInput("1");
	          }
	    
	    if(request.getParameterMap().containsKey("btn")) 
	          if( request.getParameter("btn").equals("2") && obiekt.isEnabled()) {
	        	  obiekt.addInput("2");
	          }
	    
	    if(request.getParameterMap().containsKey("btn")) 
	          if( request.getParameter("btn").equals("3") && obiekt.isEnabled()) {
	        	  obiekt.addInput("3");
	          }
	    
	    if(request.getParameterMap().containsKey("btn")) 
	          if( request.getParameter("btn").equals("4") && obiekt.isEnabled()) {
	        	  obiekt.addInput("4");
	          }
	    
	    if(request.getParameterMap().containsKey("btn")) 
	          if( request.getParameter("btn").equals("5") && obiekt.isEnabled()) {
	        	  obiekt.addInput("5");
	          }
	    
	    if(request.getParameterMap().containsKey("btn")) 
	          if( request.getParameter("btn").equals("6") && obiekt.isEnabled()) {
	        	  obiekt.addInput("6");
	          }
	    
	    if(request.getParameterMap().containsKey("btn")) 
	          if( request.getParameter("btn").equals("7") && obiekt.isEnabled()) {
	        	  obiekt.addInput("7");
	          }
	    
	    if(request.getParameterMap().containsKey("btn")) 
	          if( request.getParameter("btn").equals("8") && obiekt.isEnabled()) {
	        	  obiekt.addInput("8");
	          }
	    
	    if(request.getParameterMap().containsKey("btn")) 
	          if(request.getParameter("btn").equals("9") && obiekt.isEnabled()) {
	        	  obiekt.addInput("9");
	          }
	    
	    if(request.getParameterMap().containsKey("btn")) 
	          if(request.getParameter("btn").equals("/") && obiekt.isEnabled()) {
	        	 obiekt.setCalculationMethod("/");
	          }
	    
	    if(request.getParameterMap().containsKey("btn")) 
	          if( request.getParameter("btn").equals("*") && obiekt.isEnabled()) {
	        	 obiekt.setCalculationMethod("*");
	          }
	    
	    if(request.getParameterMap().containsKey("btn")) 
	          if(request.getParameter("btn").equals("+") && obiekt.isEnabled()) {
	        	  obiekt.setCalculationMethod("+");
	          }
	    
	    if(request.getParameterMap().containsKey("btn")) 
	          if( request.getParameter("btn").equals("-") && obiekt.isEnabled()) {
	        	  if (obiekt.getInput() == ""){
	        		  obiekt.addInput("-");
	        	  } else
	        	  obiekt.setCalculationMethod("-");
	          }
	    
	    if(request.getParameterMap().containsKey("btn")) 
	          if( request.getParameter("btn").equals(".")&& obiekt.isEnabled()) {
	        	  if (obiekt.checkDot()){
	        		  obiekt.addInput(".");
	        	  }
	          }
	    
	    if(request.getParameterMap().containsKey("btn")) 
	          if( request.getParameter("btn").equals("+/-") && obiekt.isEnabled()) {
	        	  obiekt.setInput(String.valueOf((-1)*Double.valueOf(obiekt.getInput())));
	          }
	    
	    if(request.getParameterMap().containsKey("btn")) 
	          if(request.getParameter("btn").equals("sqrt") && obiekt.isEnabled() && !obiekt.getInput().isEmpty()) {
	        	  if (Double.valueOf(obiekt.getInput())>=0)
		        	  obiekt.setInput(String.valueOf(Math.sqrt(obiekt.getInputNumber())));
	        	  else {
	        		  obiekt.setInput("ERR");
	        		  obiekt.setEnabled(false);
	        	  }
	          }
	    
	    if(request.getParameterMap().containsKey("btn")) 
	          if(request.getParameter("btn").equals("%") && obiekt.isEnabled() && !obiekt.getInput().isEmpty() && Double.valueOf(obiekt.getFirstNumber())!= null) {
	        	  obiekt.calculatePercentage();
	          }
	    
	    if(request.getParameterMap().containsKey("btn")) 
	          if( request.getParameter("btn").equals("=") && obiekt.isEnabled()) {
	        	  if (obiekt.getOperator()=="/" && obiekt.getInput().contains("0")){
	        		  obiekt.setInput("ERR");
	        		  obiekt.setFirstNumber(0);
	        	  }
	        	  else obiekt.setResult();
	        	  }
	    
		RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/calc.jsp");
		requestDispatcher.forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
