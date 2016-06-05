package com.shigemk2.libro.bootapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
