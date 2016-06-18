package com.shigemk2.libro.bootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

    @Autowired
    MyDataRepository repository;

    @RequestMapping("/hello")
    public Model hello(Model model) {
        model.addAttribute("flg", true);
        model.addAttribute("datas", new String[]
                {"One", "Two", "Three"});
        return model;
    }
}

class Data {
    private String name;
    private String mail;
    private String tel;

    public Data(String name, String mail, String tel) {
        this.name = name;
        this.mail = mail;
        this.tel = tel;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getMail() { return mail; }

    public void setMail(String mail) { this.mail = mail; }
    public String getTel() { return tel; }
    public void setTel(String tel) { this.tel = tel; }
}
