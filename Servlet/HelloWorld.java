// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet Class
public class HelloWorld extends HttpServlet {
    
    private String message;
    
    public void init() throws ServletException
    {
        message = "Hello World";
    }
    
    public void doGet(HttpServletRequest request, 
                        HttpServletResponse response)
                  throws ServletException, IOException
    {
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        out.println("<head> \n <title> first Servlet </title> \n </head>");
        out.println("<body>");
        double num = Math.random();
        if (num>0.50)
            message = "You\'ll have a super lucky day!";
        else 
            message = "You\'ll have a super duper bombastic day";
            
        out.println("<h2>" + message + "</h2>");
        out.println("<p>" + num + "</p>");
        out.println("</body>");
    }
    
    public void destroy() {}

}