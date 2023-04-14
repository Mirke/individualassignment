package com.mikaeleriksson.individualassignment.services;

import com.mikaeleriksson.individualassignment.entities.Address;

public interface AddressServiceInterface {
    Address addAddress(Address address);
    Address updateAddress(Address address, long id);
}
