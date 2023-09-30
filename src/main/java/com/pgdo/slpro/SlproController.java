package com.pgdo.slpro;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SlproController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @PostMapping("/submit")
    public String submit(@RequestParam String content, Model model) {
        Message message = new Message(content);
        model.addAttribute("message", message);
        return "result";
    }
}
