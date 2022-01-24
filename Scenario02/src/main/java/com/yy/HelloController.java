package com.yy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/Main")
public class HelloController {
    @RequestMapping("/Hello")
    public String hello(Model model){
        String msg = "h2";
        model.addAttribute("msg",msg);
        return "hello";

    }
}
