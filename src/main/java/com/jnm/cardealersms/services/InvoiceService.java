package com.jnm.cardealersms.services;

import com.jnm.cardealersms.model.Invoice;
import com.jnm.cardealersms.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {

    @Autowired
    InvoiceRepository invoiceRepository;
    public List<Invoice> getInvoice() {
        return invoiceRepository.findAll();
    }

    public void save(Invoice invoice){
        invoiceRepository.save(invoice);
    }

    public Optional<Invoice> findById(int id){
        return invoiceRepository.findById(id);
    }

    public void delete(int id){
        invoiceRepository.deleteById(id);
    }
}
