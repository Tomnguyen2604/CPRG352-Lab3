/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "arithmeticServlet", urlPatterns={"/arithmetic"})
public class arithmeticServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //shows the ----- on the start
          request.setAttribute("result", "-------");
          getServletContext().getRequestDispatcher("/WEB-INF/arithmetic.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String firstNum = request.getParameter("firstnum");
       String secondNum = request.getParameter("secondnum");
       String button = request.getParameter("button");
       
       
       request.setAttribute("firstNum", firstNum);
       request.setAttribute("secondNum", secondNum);
try {
       if(firstNum == null || firstNum.equals("") || secondNum == null || secondNum.equals("")){
           request.setAttribute("error", "Invalid, you have to type the number in!");
           request.setAttribute("result", "-----");
           getServletContext().getRequestDispatcher("/WEB-INF/arithmetic.jsp").forward(request, response);
           return;
        }
       else if(button.equals("+")){ 
           int results = Integer.parseInt(firstNum) + Integer.parseInt(secondNum);
           request.setAttribute("result", results);
           getServletContext().getRequestDispatcher("/WEB-INF/arithmetic.jsp").forward(request, response);
           return;
       }
       else if(button.equals("-")){
           int results = Integer.parseInt(firstNum) - Integer.parseInt(secondNum);
           request.setAttribute("result", results);
           getServletContext().getRequestDispatcher("/WEB-INF/arithmetic.jsp").forward(request, response);
           return;
       }
       else if(button.equals("*")){
           int results = Integer.parseInt(firstNum) * Integer.parseInt(secondNum);
           request.setAttribute("result", results);
           getServletContext().getRequestDispatcher("/WEB-INF/arithmetic.jsp").forward(request, response);
           return;
       }
       else if(button.equals("%")){
           int results = Integer.parseInt(firstNum) %   Integer.parseInt(secondNum);
           request.setAttribute("result", results);
           getServletContext().getRequestDispatcher("/WEB-INF/arithmetic.jsp").forward(request, response);
           return;
       }
           getServletContext().getRequestDispatcher("/WEB-INF/arithmetic.jsp").forward(request, response);
       }
       catch (NumberFormatException a){
           request.setAttribute("error", "Number Only!");
           getServletContext().getRequestDispatcher("/WEB-INF/arithmetic.jsp").forward(request, response);
           return;
       }
        
    }
    }

    