package com.jnm.cardealersms.repository;

import com.jnm.cardealersms.model.Employee;
import com.jnm.cardealersms.model.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobTitleRepository extends JpaRepository<JobTitle, Integer> {
}
