package org.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.example.entities.Companies;
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
class CompaniesRepositoryTest {

    @Autowired
    private CompaniesRepository Repo;

    @Autowired
    private EntityManager entityManager;

    @Test
    public void createUser(){
        Companies companies = new Companies();
        companies.setcName("McD");
        companies.setPassword("KFC");
        companies.setLocation("Cape Town");
        companies.setDescription("Burger Joint");
        companies.setContactInfo("011");

        Companies savedComp = Repo.save(companies);
        Companies existComp = entityManager.find(Companies.class,savedComp.getId());

        //assertThat(existComp.getcName()).isEqualTo(companies.getcName());
    }

    @Test
    public void updateUser(){
        Companies companies = new Companies();
        companies.setcName("KFC");
        companies.setPassword("Chicken");
        companies.setLocation("Cape Town");
        companies.setDescription("Chicken Joint");
        companies.setContactInfo("012");
        companies.setId(4);

        Companies savedComp = Repo.save(companies);
        Companies existComp = entityManager.find(Companies.class,savedComp.getId());

       // assertThat(existComp.getcName()).isEqualTo(companies.getcName());
    }

}