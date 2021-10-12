package org.example.repository;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;

import org.example.entities.User;
import org.example.repository.CompaniesRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import javax.persistence.EntityManager;

@EnableAutoConfiguration
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
class UsersRepositoryTest {

    @Autowired
    private UsersRepository userRepo;

    @Autowired
    private  EntityManager entityManager;

    @Test
    public void createUser(){
        User user = new User();

        user.setFirstName("Caven");
        user.setLastName("Alex");
        user.setDob("1999-09-09");
        user.setAddress("12 Chester");
        user.setPhoneNo("0672627162");
        user.setEmailAddress("akjncakjsn@gmail.com");
        user.setUsername("kingKai");
        user.setPassword("sdas@HHHa");

        User saveUser = userRepo.save(user);
        User exitsUser = entityManager.find(User.class,saveUser.getId());


    }
}