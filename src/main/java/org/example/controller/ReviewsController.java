package org.example.controller;

import org.example.entities.Reviews;
import org.example.repository.ReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class ReviewsController {
        @Autowired
        private ReviewsRepository repository;

        @GetMapping("/reviews-form")
        public String view(Model model){
            long idno = 2;
            model.addAttribute("reviews",repository.getById(idno));
            return "review-form";
        }
        @PostMapping("/review-feedback")
        public String processReviews(Reviews reviews){
            reviews.setId(1);
            repository.save(reviews);
            return "review-feedback";
        }

    }
