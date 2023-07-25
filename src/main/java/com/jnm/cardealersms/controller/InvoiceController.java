package com.jnm.cardealersms.controller;

import com.jnm.cardealersms.model.Client;
import com.jnm.cardealersms.model.Invoice;
import com.jnm.cardealersms.model.InvoiceStatus;
import com.jnm.cardealersms.services.ClientService;
import com.jnm.cardealersms.services.InvoiceService;
import com.jnm.cardealersms.services.InvoiceStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@Controller
public class InvoiceController {

    @Autowired InvoiceService invoiceService;
    @Autowired InvoiceStatusService  invoiceStatusService;

    @Autowired ClientService clientService;


    @GetMapping("/invoices")
    public String getInvoice(Model model){

        model.addAttribute("invoices", invoiceService.getInvoice());
        model.addAttribute("invoiceStatus", invoiceStatusService.getInvoiceStatus());
        model.addAttribute("clients",  clientService.getClient());

        return "invoices";
    }

    @PostMapping("/invoices/addNew")

    public String addNew(Invoice invoice){
        invoiceService.save(invoice);
        return "redirect:/invoices";

    }
    @RequestMapping("/invoices/findById")
    @ResponseBody
    public Optional<Invoice> findById(int id){
        return invoiceService.findById(id);
    }

    @RequestMapping(value = "/invoices/update", method = {RequestMethod.GET, RequestMethod.PUT})

    public String update(Invoice invoice){
        invoiceService.save(invoice);
        return "redirect:/invoices";
    }

    @RequestMapping(value = "/invoices/delete", method = {RequestMethod.DELETE, RequestMethod.GET})

    public String delete(int id){
        invoiceService.delete(id);
        return "redirect:/invoices";
    }
}
