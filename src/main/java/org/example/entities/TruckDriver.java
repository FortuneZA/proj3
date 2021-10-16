package org.example.entities;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.*;
//Author: Mathew Fortuin : 219069514
//Entity class for TruckDriver
//Date: 12/Oct/2021

@EnableAutoConfiguration
@Entity
@Table(name = "truckdriver")
public class TruckDriver {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "ID", nullable = false,unique = true)
   private long id;

   @Column(name = "Name", nullable = true, unique = false)
   private String Name;

   @Column(name = "Surname", nullable = true, unique = false)
   private String Surname;

   @Column(name ="Experience", nullable=true, unique = false)
   private String Experience;

   @Column(name="Address", nullable = true, unique = false)
   private String Address;

   @Column(name="Contact_Number", nullable = true, unique = false)
   private String ContactNumber;

   @Column(name = "email_address", nullable = false, unique = false)
   private String emailAddress;

   @Column(name = "password", nullable = false, unique = false)
   private String password;

    public TruckDriver() {

    }

    protected TruckDriver(long id, String name, String surname, String experience, String address, String contactNumber) {
        this.id = id;
       this.Name = name;
        this.Surname = surname;
        this.Experience = experience;
        this.Address = address;
        this.ContactNumber = contactNumber;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getExperience() {
        return Experience;
    }

    public String getAddress() {
        return Address;
    }

    public String getContactNumber() {
        return ContactNumber;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setExperience(String experience) {
        Experience = experience;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setContactNumber(String contactNumber) {
        ContactNumber = contactNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPassword() {
        return password;
    }
}
