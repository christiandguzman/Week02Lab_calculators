
package servlets;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 683676
 */
public class Week2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculator.jsp").forward(request, response);
    }

     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age = request.getParameter("age");
        
        
        
        if (age == null || age.equals("") ) {
            request.setAttribute("message", "Please enter a value.");
            getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculator.jsp").forward(request, response);
            return;
        }
        try{
            int nextage = Integer.parseInt(request.getParameter("age"));
            request.setAttribute("nextage", age+1);
        }catch(NumberFormatException e){
            request.setAttribute("message", "invalid input");
            getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculator.jsp").forward(request, response);
        }
        getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculator.jsp").forward(request, response);   
    }
}
