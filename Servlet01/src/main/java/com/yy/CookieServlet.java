package com.yy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
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
        Cookie cookie1=new Cookie("name","呵 呵");
        Cookie cookie2=new Cookie("rst", URLEncoder.encode(date,"utf-8"));// TODO URLEncoder 为何能解决空格问题
        Cookie cookie3=new Cookie("rst", date);
        response.addCookie(cookie1);
        response.addCookie(cookie2);
        Cookie[] cookies=request.getCookies();
        if (cookies!=null){
            for (Cookie cookie:cookies){
                System.out.println("Cookie: "+cookie.getName()+" Value: "+ URLDecoder.decode(cookie.getValue(),"utf-8")+"\n");
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
