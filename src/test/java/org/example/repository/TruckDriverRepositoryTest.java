package org.example;

import org.example.entities.TruckDriver;
import org.example.repository.TruckDriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import javax.persistence.EntityManager;

@EnableAutoConfiguration
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class TruckDriverRepositoryTest {

    @Autowired
    private TruckDriverRepository repo;

    @Autowired
    private EntityManager entityManager;

    @Test
    public void createDriver() {
        TruckDriver td = new TruckDriver();
        td.setName("John");
        td.setSurname("Doe");
        td.setAddress("14A Hampfield Close");
        td.setContactNumber(786807200);
        td.setExperience("Expert");


        TruckDriver savedTD = repo.save(td);
        TruckDriver existTD = entityManager.find(TruckDriver.class, savedTD.getId());

    }

}
