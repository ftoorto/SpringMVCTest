package com.yy.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
//@WebFilter(filterName = "Filter01",value = "/AjaxServlet")
//Filter 没用 为什么？
//起作用了，可能是因为没刷新
public class Filter01 implements Filter {
    static int i=1;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter 01 is initialized");
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        ((HttpServletResponse)response).setHeader("Access-Control-Allow-Origin","*");
        ((HttpServletResponse)response).setHeader("Access-Control-Allow-Methods", "POST,GET,OPTIONS,DELETE");
        response.setContentType("text/html;charset=utf-8");
        System.out.println("Before Filter 01 is working");
        System.out.println("The "+i+" time Filter 01 is accessed");
        i++;
//        ((HttpServletRequest)request).getSession();
//        ((HttpServletResponse) response).sendRedirect("/");
        chain.doFilter(request,response);
        System.out.println("After Filter 01 is working");

    }
    @Override
    public void destroy() {
        System.out.println("Filter 01 is destroyed");
    }


}
