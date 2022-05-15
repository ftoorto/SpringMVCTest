package com.yy.pojo.animal;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class Cat implements Animal{
    @Value("小喵喵")
    private String name;
    @Override
    public void bark() {
        System.out.println("meow meow");
    }
}
