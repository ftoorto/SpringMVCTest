package com.yy.utils;

import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.ServletContext;

public class StaticListener {
    static{
        ServletContext servletContext=  ContextLoaderListener.getCurrentWebApplicationContext().getServletContext();
        servletContext.addF

    }
}
