package com.company.myfirstwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello World!";
    }

    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }
}
