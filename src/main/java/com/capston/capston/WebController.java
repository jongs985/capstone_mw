package com.capston.capston;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    @RequestMapping("/")
    public String main(){
        //qwer
        return"index";
    }
}
