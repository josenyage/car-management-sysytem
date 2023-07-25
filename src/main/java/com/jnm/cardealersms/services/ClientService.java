package com.jnm.cardealersms.services;

import com.jnm.cardealersms.model.Client;
import com.jnm.cardealersms.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public List<Client> getClient(){

        return clientRepository.findAll();
    }

    public void save(Client client){
        clientRepository.save(client);
    }

    public Optional<Client> findById(int id){
        return clientRepository.findById(id);
    }

    public void delete(int id){
        clientRepository.deleteById(id);
    }
}
