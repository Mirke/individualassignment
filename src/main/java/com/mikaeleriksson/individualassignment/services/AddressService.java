package com.mikaeleriksson.individualassignment.services;

import com.mikaeleriksson.individualassignment.entities.Address;
import com.mikaeleriksson.individualassignment.exceptions.ResourceNotFoundException;
import com.mikaeleriksson.individualassignment.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <code>AddressService</code> - Serves the Address entity to the repository
 * @author Mikael Eriksson (mikael.eriksson@edu.edugrade.se)
 * @version 1.0.0
 */

@Service
public class AddressService implements AddressServiceInterface{

    // -----------------------------------------------------------------------------------------------------------------
    //   Properties
    // -----------------------------------------------------------------------------------------------------------------

    @Autowired
    private AddressRepository addressRepository;

    // -----------------------------------------------------------------------------------------------------------------
    //   Methods
    // -----------------------------------------------------------------------------------------------------------------

    @Override
    public Address addAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Address updateAddress(Address address, long id) {
        Address a = addressRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Address", "Id", id));
        a.setStreet(address.getStreet());
        a.setCity(address.getCity());
        addressRepository.save(a);
        return a;
    }
}
