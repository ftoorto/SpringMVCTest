package com.yy.pojo;

import com.yy.pojo.animal.BlackCat;
import com.yy.pojo.animal.Cat;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Data
public class BeastMaster {
    private String name;
    private int age;
    @Autowired
    private BlackCat BlackCat;
}
