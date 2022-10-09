package com.todoattemptdeux.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.todoattemptdeux.demo.model.todoModel;
import com.todoattemptdeux.demo.model.tryingTeleModel;
import com.todoattemptdeux.demo.service.todoRedisDatabase;

@Controller
public class todoController {

    @Autowired
    todoRedisDatabase service;

    //@GetMapping ("/login")
    //public String index(Model model) {
    //    return "index";
    //}

    
    @GetMapping ("/")
    public String todomainpage (Model model) {
        return "todomainpage";
    }

   // @GetMapping("")

    // where to enter rejection for past dates 

    @GetMapping ("/error")
    public String error (){
        return "error";
    }

    @PostMapping ("/submit")
    public String showItems(@ModelAttribute("todoModel") todoModel tM, Model model) {
        service.save(tM);
        model.addAttribute("todoModel", tM);
        return "showItems";
    }

    @GetMapping("/todoModel/{userId}")
    public String getbyUserId(@PathVariable String userId, Model model) {
        todoModel tM = service.findbyId(userId);
        model.addAttribute("todoModel", tM);
        return "showItems";
    }

    @GetMapping
    public String getMessage(@RequestParam(required = true) String due, Model model) {
        return "showItems";
        //scheduled timne
    }   //message to do the work 


    
}
