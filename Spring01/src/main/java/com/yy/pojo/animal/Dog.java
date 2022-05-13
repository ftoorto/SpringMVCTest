package com.yy.pojo.animal;

import lombok.Data;

@Data
public class Dog implements Animal{
    private String name;
    @Override
    public void bark() {
        System.out.println("wowowowo");
    }
}
