package com.ncnl.workflow.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class ExtensionPageController{

    @GetMapping
    public String homePage(){
        return "This is the Home Page";
    }




}
