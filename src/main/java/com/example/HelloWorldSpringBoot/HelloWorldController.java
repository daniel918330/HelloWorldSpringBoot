package com.example.HelloWorldSpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "index";  // 返回 index.html 视图
    }

    @GetMapping("/hello")
    public String sayHello(Model model) {
        model.addAttribute("message", "Hello, World ccc!");
        return "hello";  // 返回 hello.html 视图
    }
}
