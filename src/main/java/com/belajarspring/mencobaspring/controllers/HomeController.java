package com.belajarspring.mencobaspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {

    @GetMapping
    public String welcome(Model model) {
        String message = "Welcome ade";
        model.addAttribute("t", "mamama huhuh");
        return "index";
    }
}
