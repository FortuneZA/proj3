package org.example.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Reviews {@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "ID", nullable = false, unique = true, length = 245)
private long id;

    @Column(name = "first-name", nullable = false, unique = false, length = 40)
    private String firstName;

    @Column(name = "last-name", nullable = false, unique = false, length = 65)
    private String lastName;

    @Column(name = "province", nullable = true, unique = false, length = 40)
    private String province;

    @Column(name = "pros", nullable = true, unique = false, length = 245)
    private String pros;

    @Column(name = "cons", nullable = false, unique = false, length = 245)
    private String cons;

    @Column(name = "description1", nullable = true, unique = false, length = 245)
    private String description1;

    @Column(name = "description1", nullable = false, unique = false, length = 245)
    private String description2;

    @Column(name = "description3", nullable = true, unique = false, length = 245)
    private String description3;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPros() {
        return pros;
    }

    public void setPros(String pros) {
        this.pros = pros;
    }

    public String getCons() {
        return cons;
    }

    public void setCons(String cons) {
        this.cons = cons;
    }

    public String getDescription1() {
        return description1;
    }

    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    public String getDescription3() {
        return description3;
    }

    public void setDescription3(String description3) {
        this.description3 = description3;
    }

}