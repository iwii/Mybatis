package com.example.paging.controller;

import com.example.paging.dto.AllorgDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(path = "/home", method = RequestMethod.GET)
    public String home(final Model model) {
        model.addAttribute(AllorgDetails.createEmptyObject());
        return "home";
    }
}
