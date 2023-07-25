package com.jnm.cardealersms.controller;

import com.jnm.cardealersms.model.Client;
import com.jnm.cardealersms.model.Contact;
import com.jnm.cardealersms.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
;import java.util.Optional;

@Controller
public class ContactController {

    @Autowired
    ContactService contactService;
    @GetMapping("/contacts")
    public String getContact(Model model){
        model.addAttribute("contacts", contactService.getContact());
        return "contacts";
    }

    @PostMapping("/contacts/addNew")
    public String addNew(Contact contact){
        contactService.save(contact);
        return "redirect:/contacts";
    }

    @RequestMapping("/contacts/findById")
    @ResponseBody
    public Optional<Contact> findById(int id){
        return contactService.findById(id);
    }

    @RequestMapping(value = "/contacts/update", method = {RequestMethod.GET, RequestMethod.PUT})

    public String update(Contact contact){
        contactService.save(contact);
        return "redirect:/contacts";
    }

    @RequestMapping(value = "/contacts/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete (int id){
        contactService.delete(id);
        return "redirect:/contacts";
    }

}
