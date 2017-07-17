package com.procurement.web;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CreateController {

    @RequestMapping("create")
    public String create(Model model) {
        model.addAttribute("now", LocalDateTime.now());
        return "create";
    }
}
