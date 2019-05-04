package com.test.vue.spirngbootvue.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController implements ErrorController {

    @GetMapping({"/","/error"})
    public String getUser() {
        return "index";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }

}
