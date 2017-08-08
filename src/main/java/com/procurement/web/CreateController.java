package com.procurement.web;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.procurement.domain.Product;
import com.procurement.service.ProductServiceImpl;

@Controller
@RequestMapping("/")
public class CreateController {
    @Autowired
    private ProductServiceImpl productServiceImpl;

    @GetMapping("create")
    public String create(Model model) {
        model.addAttribute("now", LocalDateTime.now());
        return "create";
    }

    @PostMapping("create")
    public String createProduct(@ModelAttribute Product product) {
        this.productServiceImpl.saveProduct(product);
        return "create";
    }
}
