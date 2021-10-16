package org.example.repository;

import org.example.entities.Reviews;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import javax.persistence.EntityManager;

@EnableAutoConfiguration
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)

public class ReviewsRepositoryTest {
    @Autowired
    private ReviewsRepository Repo;

    @Autowired
    private EntityManager entityManager;

    @Test
    public void createReviews(){
        Reviews reviews = new Reviews();
        reviews.setFirstName("John");
        reviews.setLastName("Mavis");
        reviews.setProvince("Cape Town");
        reviews.setOverall("I find it easy to use this website");


        Reviews savedReview = Repo.save(reviews);
        Reviews existReview = entityManager.find(Reviews.class,savedReview.getId());

        //assertThat(existReview.getFirstName()).isEqualTo(reviews.getFirstName());
    }

    @Test
    public void updateReviews(){
        Reviews reviews = new Reviews();
        reviews.setFirstName("John");
        reviews.setLastName("Mavis");
        reviews.setProvince("Cape Town");
        reviews.setOverall("I find it easy to use this website");

        reviews.setId(4);

        Reviews savedReview = Repo.save(reviews);
        Reviews  existReview = entityManager.find( Reviews .class,savedReview.getId());

      //  assertThat(existReview.getFirstName()).isEqualTo(reviews.getFirstName());
    }

}