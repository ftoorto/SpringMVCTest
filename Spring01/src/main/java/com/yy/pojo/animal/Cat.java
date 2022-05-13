package com.yy.pojo.animal;

import lombok.Data;

@Data
public class Cat implements Animal{
    private String name;
    @Override
    public void bark() {
        System.out.println("meow meow");
    }
}
