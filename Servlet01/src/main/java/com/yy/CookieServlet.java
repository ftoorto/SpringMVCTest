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
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
        String date=simpleDateFormat.format(new Date());
        Cookie cookie1=new Cookie("name","aaa");
        Cookie cookie2=new Cookie("rst",date);
        response.addCookie(cookie1);
        response.addCookie(cookie2);// TODO 为何不能一次加两个cookie
        Cookie[] cookies=request.getCookies();
        if (cookies!=null){
            for (Cookie cookie:cookies){
                System.out.println("Cookie: "+cookie+"\n");
            }
        }
        else {
            System.out.println("第一次访问，未携带cookie");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
