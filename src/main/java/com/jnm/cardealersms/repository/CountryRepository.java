package com.jnm.cardealersms.repository;

import com.jnm.cardealersms.model.Client;
import com.jnm.cardealersms.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
}
