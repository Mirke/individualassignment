package com.mikaeleriksson.individualassignment.entities;

import javax.persistence.*;

/**
 * <code>Address</code> - Address entity
 * @author Mikael Eriksson (mikael.eriksson@edu.edugrade.se)
 * @version 1.0.0
 */

@Entity
public class Address {

    // -----------------------------------------------------------------------------------------------------------------
    //   Properties
    // -----------------------------------------------------------------------------------------------------------------

    @Id
    private long postalCode;

    @Column(length = 90)
    private String street;

    @Column(length = 90)
    private String city;

    // -----------------------------------------------------------------------------------------------------------------
    //   Constructors
    // -----------------------------------------------------------------------------------------------------------------

    public Address() {
    }

    public Address(long postalCode, String street, String city) {
        this.postalCode = postalCode;
        this.street = street;
        this.city = city;
    }

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    // -----------------------------------------------------------------------------------------------------------------
    //   Methods
    // -----------------------------------------------------------------------------------------------------------------

    public long getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(long id) {
        this.postalCode = id;
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
