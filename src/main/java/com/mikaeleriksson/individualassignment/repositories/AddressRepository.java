package com.mikaeleriksson.individualassignment.repositories;

import com.mikaeleriksson.individualassignment.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
