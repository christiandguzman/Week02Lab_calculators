/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 683676
 */
public class ArithmeticCalculatorServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String x = request.getParameter("x");
        String y = request.getParameter("y");
        String solve = request.getParameter("solve");
        try{
            int xnum = Integer.parseInt(x);
            int ynum = Integer.parseInt(y);
        
        
        if (x == null || x.equals("") || y == null || y.equals("") ) {
            request.setAttribute("message", "Please enter a value.");
            getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp").forward(request, response);
            return;
        }
        
        float ans =0;
        
        switch (solve){
            case "+":
                ans = xnum + ynum;
                break;
            case "/":
                ans = xnum/ynum;
                break;
            case "*":
                ans = xnum*ynum;
                break;
            case "%":
                ans = xnum%ynum;
                break;
        }
        request.setAttribute("message","The answer is "+ ans);
        request.setAttribute("x",xnum);
       
        getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp").forward(request, response);  
       
        
        
        }catch(NumberFormatException e){
            request.setAttribute("message", "Invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp").forward(request, response);
        }
    }   
}
