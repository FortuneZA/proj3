package org.example.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

//Author: Mathew Fortuin : 219069514
//Entity class for TruckDriver
//Date: 12/Oct/2021

@EnableAutoConfiguration
@Entity
@Table(name = "LogiTruck")

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

   @Column(name="Contact Number",nullable = false,unique = false,length =40)
    private Long ContactNumber;

    public TruckDriver() {

    }

    protected TruckDriver(long id, String name, String surname, String experience, String address, Long contactNumber) {
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

    public Long getContactNumber() {
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

    public void setContactNumber(Long contactNumber) {
        ContactNumber = contactNumber;
    }
}
