package com.procurement.web;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.procurement.service.ProductServiceImpl;

@Controller
@RequestMapping("/")
public class LoginController {
	
	private static Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(Model model) {
        return "login";
    }
    
    @RequestMapping(value = "signUp", method = RequestMethod.GET)
    public String signUp(Model model) {
        return "signUp";
    }
}
