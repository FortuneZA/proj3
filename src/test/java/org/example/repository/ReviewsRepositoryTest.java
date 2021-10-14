package org.example.repository;

import org.example.entities.Reviews;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

import static org.assertj.core.api.Assertions.assertThat;

public class ReviewsRepositoryTest {    @Autowired
private ReviewsRepository Repo;

    @Autowired
    private EntityManager entityManager;

    @Test
    public void createUserReviews(){
        Reviews reviews = new Reviews();
        reviews.setFirstName("John");
        reviews.setLastName("Mavis");
        reviews.setProvince("Cape Town");
        reviews.setPros("I find it easy to use this website");
        reviews.setCons("This website is simple to use");
        reviews.setDescription1("Testing");
        reviews.setDescription1("Testing2");
        reviews.setDescription1("Testing3");

        Reviews savedReview = Repo.save(reviews);
        Reviews existReview = entityManager.find(Reviews.class,savedReview.getId());

        assertThat(existReview.getFirstName()).isEqualTo(reviews.getFirstName());
    }

    @Test
    public void updateReviews(){
        Reviews reviews = new Reviews();
        reviews.setFirstName("John");
        reviews.setLastName("Mavis");
        reviews.setProvince("Cape Town");
        reviews.setPros("I find it easy to use this website");
        reviews.setCons("This website is simple to use");
        reviews.setDescription1("Testing");
        reviews.setDescription1("Testing2");
        reviews.setDescription1("Testing3");
        reviews.setId(4);

        Reviews savedReview = Repo.save(reviews);
        Reviews  existReview = entityManager.find( Reviews .class,savedReview.getId());

        assertThat(existReview.getFirstName()).isEqualTo(reviews.getFirstName());
    }

}