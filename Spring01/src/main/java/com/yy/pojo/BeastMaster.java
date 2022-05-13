package com.yy.pojo;

import com.yy.pojo.animal.BlackCat;
import com.yy.pojo.animal.Cat;
import lombok.Data;

@Data
public class BeastMaster {
    private String name;
    private int age;
    private BlackCat BlackCat;
}
