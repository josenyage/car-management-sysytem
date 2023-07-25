package com.jnm.cardealersms.services;

import com.jnm.cardealersms.model.Contact;
import com.jnm.cardealersms.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {
    @Autowired
    ContactRepository contactRepository;

    public List<Contact> getContact(){
    return contactRepository.findAll();
    }

    public void save(Contact contact){
        contactRepository.save(contact);
    }

    public Optional<Contact> findById(int id){
      return  contactRepository.findById(id);
    }

    public void delete(int id){
        contactRepository.deleteById(id);
    }

}
