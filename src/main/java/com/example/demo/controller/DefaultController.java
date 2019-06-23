package com.example.             demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 曾令宇
 * @since 2019年06月20日 16:49
 */
@Controller
@RequestMapping("/")
public class DefaultController {
    @RequestMapping
    public String index() {
        return "index";
    }

    @RequestMapping("registration")
    public String registration() {
        return "registration";
    }
}
