package com.yy;

import com.yy.pojo.BeastMaster;
import com.yy.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest01 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        BeastMaster user=(BeastMaster)context.getBean("user_lieren");
        System.out.println(user.toString());
    }
}
