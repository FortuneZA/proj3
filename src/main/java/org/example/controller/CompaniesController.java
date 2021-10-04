package org.example.controller;

import org.example.repository.CompaniesRepository;
import org.example.entities.Companies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CompaniesController {

    @Autowired
    private CompaniesRepository repository;

        @GetMapping("/profile")
        public String view(Model model){
            long bub = 2;
            model.addAttribute("company",repository.getById(bub));
            return "profile";
    }

    @PostMapping("/process_register")
    public String processRegistration(Companies companies){
            companies.setId(2);
            repository.save(companies);
            return "register_success";
    }
}
