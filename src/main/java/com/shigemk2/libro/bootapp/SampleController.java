package com.shigemk2.libro.bootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Iterator;

@Controller
public class SampleController {

    @Autowired
    MyDataRepository repository;

    @RequestMapping("/hello")
    public String hello(Model model) {
        Iterable<MyData> list = repository.findAll();
        model.addAttribute("datas", list);
        return "hello";
    }
}
