package com.shigemk2.libro.bootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public String hello(Model model,
                        @RequestParam("name") String name,
                        @RequestParam("mail") String mail,
                        @RequestParam("tel") String tel,
                        @RequestParam("age") int age) {
        MyData mydata = new MyData(name, mail, tel, age);
        repository.saveAndFlush(mydata);
        Iterable<MyData> list = repository.findAll();
        model.addAttribute("datas", list);
        return "hello";
    }

    @RequestMapping(value = "/find", method = RequestMethod.POST)
    public String find(Model model,
                       @RequestParam("find") int id) {
        MyData data = repository.getOne(id);
        model.addAttribute("datas", data);
        return "hello";
    }
}
