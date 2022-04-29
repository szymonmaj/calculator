package com.example.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalcController {

@GetMapping("/")
    public String calc(Model model){
    model.addAttribute("hello","mamama");
    return "calc";
}


}
