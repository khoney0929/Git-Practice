package com.example.firstProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model){
        model.addAttribute("username", "허니");
        return "greetings"; //templates/greetings.mustache -> 브라우저송출
    }

    @GetMapping("/bye")
    public String byeBye(Model model){
        model.addAttribute("username", "허니");
        return "byeBye";
    }
}
