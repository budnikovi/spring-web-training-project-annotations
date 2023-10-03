package com.example.ltptaskproject;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {
    @GetMapping("form")
    public String getForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "form";
    }
    @GetMapping("result")
    public String getResult() {
        return "result";
    }
    @PostMapping("/handleSubmit")
    public String handleSubmit(@Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            return "form";
        }
        return "redirect:/result";
    }
}
