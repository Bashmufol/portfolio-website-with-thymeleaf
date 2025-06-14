package com.bash.portfolio_website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showHomePage(){
        return "index";
    }

    @GetMapping("/contact")
    public String showContactPage(){
        return "contact";
    }

    @GetMapping("/projects")
    public String showProjectsPage(){
        return "projects";
    }

    @GetMapping("/resume")
    public String showResumePage(){
        return "resume";
    }
}
