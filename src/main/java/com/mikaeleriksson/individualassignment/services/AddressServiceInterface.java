package com.mikaeleriksson.individualassignment.services;

import com.mikaeleriksson.individualassignment.entities.Address;
import org.springframework.stereotype.Repository;

/**
 * <code>AddressServiceInterface</code> - Interface for Address service
 * @author Mikael Eriksson (mikael.eriksson@edu.edugrade.se)
 * @version 1.0.0
 */

@Repository
public interface AddressServiceInterface {
    Address addAddress(Address address);
    Address updateAddress(Address address, long id);
}
