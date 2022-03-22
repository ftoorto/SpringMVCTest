package com.yy;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "CookieServlet", value = "/CookieServlet")
public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
        String date=simpleDateFormat.format(new Date());
        Cookie cookie1=new Cookie("name","aaa");
        Cookie cookie2=new Cookie("日期",date);
        response.addCookie(cookie1);
        response.addCookie(cookie2);
        Cookie[] cookies=request.getCookies();

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
