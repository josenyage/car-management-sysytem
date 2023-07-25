package com.jnm.cardealersms.services;

import com.jnm.cardealersms.model.EmployeeType;
import com.jnm.cardealersms.model.InvoiceStatus;
import com.jnm.cardealersms.repository.EmployeeTypeRepository;
import com.jnm.cardealersms.repository.InvoiceStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceStatusService {
    @Autowired
    InvoiceStatusRepository invoiceStatusRepository;

    // return a list of employee types
    public List<InvoiceStatus> getInvoiceStatus() {
        return invoiceStatusRepository.findAll();
    }

    // save a new employee type
    public void save(InvoiceStatus invoiceStatus) {
        invoiceStatusRepository.save(invoiceStatus);
    }

    // find employee type by id

    public Optional<InvoiceStatus> findById(Integer id) {
        return invoiceStatusRepository.findById(id);
    }

    public void delete(int id) {
        invoiceStatusRepository.deleteById(id);
    }
}
