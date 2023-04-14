package com.mikaeleriksson.individualassignment.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String street;
    private String city;

//    @OneToMany
//    private Set<Member> member;

    public Address() {
    }

    public Address(long id, String street, String city) {
        this.id = id;
        this.street = street;
        this.city = city;
    }

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
