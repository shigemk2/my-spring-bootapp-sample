package com.shigemk2.libro.bootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SampleController {

    @Autowired
    private MyMongoRepository mongoRepository;

    @RequestMapping("/hello")
    public Model hello(Model model) {
        List<MongoData> datas = mongoRepository.findAll();
        model.addAttribute("msg", "this is MongoDB sample.");
        model.addAttribute("datas", datas);
        return model;
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public Model post(Model model,
                      @RequestParam("key") String key) {
        List<MongoData> datas = mongoRepository.findByTitle(key);
        if (datas == null)
            datas =new ArrayList<MongoData>();
        model.addAttribute("msg", "this is MongoDB sample.");
        model.addAttribute("datas", datas);
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
