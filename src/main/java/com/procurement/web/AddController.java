package com.procurement.web;

import java.time.LocalDateTime;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.procurement.domain.Product;
import com.procurement.service.ProductServiceImpl;

@Controller
@RequestMapping("/")
public class AddController {
    private static Logger logger = LoggerFactory.getLogger(AddController.class);
    
    @Autowired
    private ProductServiceImpl productServiceImpl;

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String create(Model model) {
        model.addAttribute("now", LocalDateTime.now());
        return "add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String createProduct(@ModelAttribute(value="product") @Valid Product product, BindingResult bindingResult) {
        if( bindingResult.hasErrors())
        {
            logger.debug("There are errors! {}", bindingResult);
            return "error";
        }
        
        this.productServiceImpl.saveProduct(product);
        return "add";
    }
}
