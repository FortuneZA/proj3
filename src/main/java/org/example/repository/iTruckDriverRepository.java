package org.example.repository;

import org.example.entities.TruckDriver;
import org.example.entities.TruckDriver;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Set;


@SpringBootApplication
@EnableAutoConfiguration
@Repository
public interface iTruckDriverRepository extends JpaRepository<TruckDriver,Long> {



}
