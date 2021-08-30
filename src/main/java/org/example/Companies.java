package org.example;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.*;
@EnableAutoConfiguration
@Entity
@Table(name = "companies")
public class Companies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, unique = true, length = 245)
    private long id;

    @Column(name = "cName", nullable = false, unique = true, length = 40)
    private String cName;

    @Column(name = "password", nullable = false, unique = true, length = 65)
    private String password;

    @Column(name = "location", nullable = true, unique = true, length = 40)
    private String location;

    @Column(name = "description", nullable = true, unique = true, length = 245)
    private String description;

    @Column(name = "contactInfo", nullable = false, unique = true, length = 40)
    private String contactInfo;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
