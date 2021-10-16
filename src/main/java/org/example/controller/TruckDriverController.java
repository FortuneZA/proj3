package org.example.controller;

import org.example.entities.TruckDriver;
import org.example.repository.TruckDriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller

public class TruckDriverController {

    @Autowired
    private TruckDriverRepository repository;

    @GetMapping("/TruckerProfile")
    public String view(Model model){
        long idno = 2;
        model.addAttribute("truck driver",repository.getAll());
        return "trucker-profile";
    }
    @PostMapping("/TruckerProfile")
    public String processProfile(TruckDriver driver){
        driver.setId(1);
        repository.save(driver);
        return "TruckerProfile";
    }

}
