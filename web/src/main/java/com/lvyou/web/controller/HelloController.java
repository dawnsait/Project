package com.lvyou.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping(value ="/hello")
    public ModelAndView ordinary(ModelMap model) {
        model.addAttribute("message", "Spring 3 MVC Hello World");
        ModelAndView returnModel = new ModelAndView("hello", model);
        return returnModel;
    }
}
