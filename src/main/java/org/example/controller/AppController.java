package org.example.controller;

import org.example.entities.User;
import org.example.repository.CompaniesRepository;
import org.example.entities.Companies;
import org.example.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
public class AppController {

    @Autowired
    private CompaniesRepository repository;

        @GetMapping("/company-profile")
        public String view(Model model){
            long bub = 2;
            model.addAttribute("company",repository.getById(bub));
            return "company-profile";
    }

    @PostMapping("/process_register")
    public String processRegistration(Companies companies){
            companies.setId(2);
            repository.save(companies);
            return "register_success";
    }

    @Autowired
    private UsersRepository repository1;

        @GetMapping("/user-profile")
        public String view2(Model model){
            long bub =2;
            model.addAttribute("user",repository.getById(bub));
            return "user-profile";
        }

    @PostMapping("/process_")
    public String processRegistration(User user){
            user.setId(1);
            repository1.save(user);
            return "register_success";
    }

}
