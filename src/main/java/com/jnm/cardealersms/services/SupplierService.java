package com.jnm.cardealersms.services;

import com.jnm.cardealersms.model.Supplier;
import com.jnm.cardealersms.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupplierService {
    @Autowired
    SupplierRepository supplierRepository;

    public List<Supplier> getSupplier(){
        return supplierRepository.findAll();
    }

    public void save(Supplier supplier){
        supplierRepository.save(supplier);
    }

    public Optional<Supplier> findById(int id){
        return supplierRepository.findById(id);
    }

    public void delete(int id){
        supplierRepository.deleteById(id);
    }
}
