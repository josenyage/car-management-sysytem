package com.jnm.cardealersms.services;

import com.jnm.cardealersms.model.EmployeeType;
import com.jnm.cardealersms.model.JobTitle;
import com.jnm.cardealersms.repository.EmployeeTypeRepository;
import com.jnm.cardealersms.repository.JobTitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobTitleService {
    @Autowired
    JobTitleRepository jobTitleRepository;

    // return a list of employee types
    public List<JobTitle> getJobTitle() {
        return jobTitleRepository.findAll();
    }

    // save a new employee type
    public void save(JobTitle jobTitle) {
        jobTitleRepository.save(jobTitle);
    }

    // find employee type by id

    public Optional<JobTitle> findById(Integer id) {
        return jobTitleRepository.findById(id);
    }

    public void delete(int id) {
        jobTitleRepository.deleteById(id);
    }
}
