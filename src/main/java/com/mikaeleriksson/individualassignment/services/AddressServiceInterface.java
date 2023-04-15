package com.mikaeleriksson.individualassignment.services;

import com.mikaeleriksson.individualassignment.entities.Address;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressServiceInterface {
    Address addAddress(Address address);
    Address updateAddress(Address address, long id);
}
