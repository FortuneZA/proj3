package org.example.entities;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.*;

//Author: Mathew Fortuin : 219069514
//Entity class for TruckDriver
//Date: 12/Oct/2021

@EnableAutoConfiguration
@Entity
@Table(name = "Truck Driver")

public class TruckDriver

{
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID",nullable = false,unique = true,length =15)
    private long id;

   @Column(name = "Name", nullable = false,unique = false,length =40)
    private String Name;

   @Column(name = "Surname",nullable = false,unique = false,length =40)
    private String Surname;

   @Column(name ="Experience",nullable=false,unique = false, length = 40)
    private String Experience;

   @Column(name="Address",nullable = false,unique = false,length =40)
    private String Address;

   @Column(name="Contact Number",nullable = false,unique = false,length =50)
    private int ContactNumber;

    public TruckDriver() {

    }

    protected TruckDriver(long id, String name, String surname, String experience, String address, int contactNumber) {
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

    public int getContactNumber() {
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

    public void setContactNumber(int contactNumber) {
        ContactNumber = contactNumber;
    }
}
