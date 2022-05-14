package com.example.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.awt.*;
import java.math.BigDecimal;
import java.util.List;

import static java.util.Arrays.asList;

@Controller
public class CalcController {
    @GetMapping("/")
    public String showForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "start";
    }

    @GetMapping("/dodawanie")
    public String showForm3(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "dodawanie";
    }

    @GetMapping("/odejmowanie")
    public String showForm5(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "odejmowanie";
    }

    @GetMapping("/mnozenie")
    public String showForm6(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "mnozenie";
    }

    @GetMapping("/dzielenie")
    public String showForm7(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "dzielenie";
    }

    @PostMapping("/dodawanie")
    public String submitForm(@ModelAttribute("user") User user, String zzzz) {
        System.out.println(zzzz);
        System.out.println(user);
        return "adding";
    }

    @PostMapping("/odejmowanie")
    public String submitForm3(@ModelAttribute("user") User user) {
        System.out.println(user);
        return "subtracting";
    }

    @PostMapping("/mnozenie")
    public String submitForm4(@ModelAttribute("user") User user) {
        System.out.println(user);
        return "multiplying";
    }

    @PostMapping("/dzielenie")
    public String submitForm5(@ModelAttribute("user") User user) {
        System.out.println(user);
        return "division";
    }

    @PostMapping("/")
    public String submitForm6(@ModelAttribute @Valid User user, @RequestParam(required = false) String name) {
        System.out.println(user);
        if (name.equals("+")){
            user.C = "+";
            return "start";
        }
        if (name.equals("-")){
            user.C = "-";
            return "start";
        }
        if (name.equals("*")){
            user.C = "*";
            return "start";
        }
        else {
            user.C = "/";
            return "start";
        }
    }

//    public double a = 10;
//    public double b = 5;
//@GetMapping("/")
//    public String calc(Model model){
//    double c = a + b;
//    model.addAttribute("hello","mamama");
//    model.addAttribute("c", c);
//    model.getAttribute("d");
//    return "calc";
//}
//@GetMapping("/")
//    public String adding(Model model){
//    double c = a + b;
//    model.addAttribute("c", "c");
//    return "calc";
//    }
// TextField textField = new TextField();
// String fdg = textField.getText();
//@RequestMapping("/")
//public String index(
//        @RequestParam(value = "participant", required = false) String participant,
//        @RequestParam(value = "country", required = false) String country,
//        @RequestParam(value = "action", required = false) String action,
//        @RequestParam(value = "id", required = false) Integer id,
//        Model model
//) {
//    model.addAttribute("id", id);
//    List<Integer> userIds = asList(1,2,3,4);
//    model.addAttribute("userIds", userIds);
//    return "calc";
//}
}


