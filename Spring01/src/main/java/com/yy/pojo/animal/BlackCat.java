package com.yy.pojo.animal;

public class BlackCat extends Cat{
    private String name;

    @Override
    public void bark() {
        System.out.println("meow meow meow");
    }
}
