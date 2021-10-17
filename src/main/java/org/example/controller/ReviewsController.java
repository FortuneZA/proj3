package org.example.controller;

import org.example.entities.Companies;
import org.example.entities.Reviews;
import org.example.entities.User;
import org.example.repository.CompaniesRepository;
import org.example.repository.ReviewsRepository;
import org.example.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class ReviewsController {
    @Autowired
    private ReviewsRepository repository;

    @GetMapping("/review-form")
    public String view(Model model) {
        long idno = 2;
        model.addAttribute("reviews", repository.getById(idno));
        return "review-form";
    }

    @PostMapping("/review-feedback")
    public String processReviews(Reviews reviews) {
        reviews.setId(2);
        repository.save(reviews);
        return "review-feedback";
    }
}

