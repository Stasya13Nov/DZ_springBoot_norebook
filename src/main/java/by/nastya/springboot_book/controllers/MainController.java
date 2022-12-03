package by.nastya.springboot_book.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping
    public String string(){
        return "index";
    }
}
