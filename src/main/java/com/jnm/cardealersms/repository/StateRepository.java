package com.jnm.cardealersms.repository;

import com.jnm.cardealersms.model.Employee;
import com.jnm.cardealersms.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {
}
