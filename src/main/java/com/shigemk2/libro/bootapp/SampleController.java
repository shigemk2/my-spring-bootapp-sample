package com.shigemk2.libro.bootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

    @Autowired
    MyDataRepository repository;

    @RequestMapping("/hello")
    public ModelAndView hello(ModelAndView mav) {
        mav.setViewName("hello");
        mav.addObject("msg", "これはThymeleafを使ったサンプルです。");
        return mav;
    }
}
