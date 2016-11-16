package com.thyme.demo.ui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/demo")
public class DemoUi
{
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String demo(ModelMap model)
    {
        model.addAttribute("message", "Demo UI for the Application");
        return "demo";
    }

    @RequestMapping(value = "/submitForm", method = RequestMethod.POST)
    public String submitRequest(ModelMap model, @RequestParam("username") String username,
        @RequestParam("password") String password)
    {
        model.addAttribute("message", "Form submitted successfully...!");
        model.addAttribute("username", username);
        model.addAttribute("password", password);
        return "demo";
    }

    @RequestMapping(value = "/iterate", method = RequestMethod.GET)
    public String submitRequest(ModelMap model)
    {
        List<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Tony");
        names.add("James");
        model.addAttribute("message", "Demo UI for the Application");
        model.addAttribute("namesList", names);

        return "demo";
    }
}
