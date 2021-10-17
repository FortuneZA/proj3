package org.example.repository;

import org.example.entities.Companies;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@SpringBootApplication
@EnableAutoConfiguration
@Repository
public interface CompaniesRepository extends JpaRepository<Companies,Long> {
    Companies findBycName(String cName);
    Boolean existsBycName(String cName);
    Boolean existsBypassword(String password);
}
