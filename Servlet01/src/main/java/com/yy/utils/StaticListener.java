package com.yy.utils;

import org.springframework.web.context.ContextLoaderListener;

import jakarta.servlet.ServletContext;

public class StaticListener {
    static{
        ServletContext servletContext=  (ServletContext)ContextLoaderListener.getCurrentWebApplicationContext().getServletContext();
        getServletContext

    }
}
