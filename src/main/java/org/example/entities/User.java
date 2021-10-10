package org.example.entities;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@EnableAutoConfiguration
@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name", length = 30, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 30, nullable = false)
    private String lastName;

    @Column(name = "dob")
    private String dob;

    @Column(name = "address", length = 40)
    private String address;

    @Column(name = "phone_no", length = 20)
    private String phoneNo;

    @Column(name = "email_address", length = 40, nullable = false)
    private String emailAddress;

    @Column(name = "username", length = 30, nullable = false)
    private String username;

    @Column(name = "password", length = 15, nullable = false)
    private String password;

    @Column(name = "rating", nullable = true)
    private int rating;

    public User() {
        super();
    }
}
