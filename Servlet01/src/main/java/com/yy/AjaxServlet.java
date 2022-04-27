package com.yy;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "AjaxServlet", value = "/AjaxServlet")
public class AjaxServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setCharacterEncoding("utf-8");
//        response.setHeader("Access-Control-Allow-Origin","*");
//        response.setHeader("Access-Control-Allow-Methods", "POST,GET,OPTIONS,DELETE");
//        response.setContentType("text/html;charset=utf-8");

        String No= (String) request.getParameter("no");

        String Name=(String) request.getParameter("name");
        System.out.println("No: "+No+"\n"+"Name: " +Name);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Integer integer=(Integer) request.getServletContext().getAttribute("次数");
        boolean b = integer != null;
        if(integer != null){
            response.getWriter().print(integer.toString());
        }
        else
            response.getWriter().println("首次访问");
//        response.sendRedirect("index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
