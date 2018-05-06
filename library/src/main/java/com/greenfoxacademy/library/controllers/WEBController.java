package com.greenfoxacademy.library.controllers;

import com.greenfoxacademy.library.services.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WEBController {

    @Autowired
    BookServiceImpl bookService;

    @GetMapping("index")
    public String getIndex(Model model) {
        model.addAttribute("books",bookService.getAllBook());
        return "index";
    }
}
