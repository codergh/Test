package com.procurement.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.procurement.domain.Product;
import com.procurement.service.ProductServiceImpl;

@Controller
public class HistoryController {

    @Autowired
    private ProductServiceImpl productServiceImpl;

    @RequestMapping(value = "/history", method = RequestMethod.GET)
    public Object create(@RequestParam(value="pageon",defaultValue="1")int pageon, ModelAndView modelAndView) {
        modelAndView.addAllObjects(productServiceImpl.find(pageon));
        modelAndView.setViewName("history");
        return modelAndView;
    }
}
