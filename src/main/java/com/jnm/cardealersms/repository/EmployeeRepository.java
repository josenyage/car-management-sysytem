package com.jnm.cardealersms.repository;

import com.jnm.cardealersms.model.Client;
import com.jnm.cardealersms.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    @Query(value = "select * from Employee e where e.firstname like %:keyword% or e.lastname like %:keyword%")
    List<Employee> findByKeyword(@Param("keyword") String keyword);

    Employee findByUsername(String un);
}
