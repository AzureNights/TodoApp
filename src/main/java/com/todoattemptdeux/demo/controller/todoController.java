package com.todoattemptdeux.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class todoController {

    @GetMapping ("/")
    public String index(Model model) {
        return "index";
    }

   // @GetMapping("")

    // where to enter rejection for past dates 
}
