package com.jnm.cardealersms.services;

import com.jnm.cardealersms.model.Country;
import com.jnm.cardealersms.model.State;
import com.jnm.cardealersms.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    public List<State> getStates() {

        return stateRepository.findAll();
    }

    public void save(State state){
        stateRepository.save(state);
    }

    public Optional<State> findById(int id) {

        return stateRepository.findById(id);
    }

    public void delete(Integer id) {

        stateRepository.deleteById(id);
    }
}
