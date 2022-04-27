package com.yy.listener;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebListener
public class Listener01 implements ServletContextListener, HttpSessionListener, HttpSessionAttributeListener,ServletRequestListener {
    static Integer i=0;
    public Listener01() {
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Request is destroyed");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        i++;
        System.out.println("累计访问次数："+i+"次");
        System.out.println("Request is initialized:"+sre.getSource());
        sre.getServletContext().setAttribute("次数", i);
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        /* This method is called when the servlet context is initialized(when the Web application is deployed). */
        System.out.println("Servlet context is initialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        /* This method is called when the servlet Context is undeployed or Application Server shuts down. */
        System.out.println("Servlet context is undeployed");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        /* Session is created. */
        // # TODO Session在tomcat自动开启网页时会被创建两次，手动开启却只有一次？
        System.out.println("Session is created: "+ se.getSession());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        /* Session is destroyed. */
        System.out.println("Session is destroyed.");
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent sbe) {
        /* This method is called when an attribute is added to a session. */
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent sbe) {
        /* This method is called when an attribute is removed from a session. */
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent sbe) {
        /* This method is called when an attribute is replaced in a session. */
    }
}
