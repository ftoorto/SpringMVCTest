package com.yy;

import com.yy.config.MyConfig01;
import com.yy.pojo.animal.Cat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTest02 {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig01.class);
        Cat cat = context.getBean("cat", Cat.class);
        System.out.println(cat);
    }
}
