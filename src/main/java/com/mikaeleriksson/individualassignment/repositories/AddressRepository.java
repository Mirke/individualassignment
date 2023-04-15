package com.mikaeleriksson.individualassignment.repositories;

import com.mikaeleriksson.individualassignment.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <code>AddressRepository</code> - Implements Jpa methods for Adress entity
 * @author Mikael Eriksson (mikael.eriksson@edu.edugrade.se)
 * @version 1.0.0
 */

public interface AddressRepository extends JpaRepository<Address,Long> {
}
