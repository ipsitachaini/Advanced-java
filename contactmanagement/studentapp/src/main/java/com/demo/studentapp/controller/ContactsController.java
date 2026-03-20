package com.demo.studentapp.controller;
import com.demo.studentapp.model.Contacts;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactsController {

    private List<Contacts> contactsList = new ArrayList<>();
    @PostMapping
    public Contacts addContacts(@RequestBody Contacts s) {
        contactsList.add(s);
        return s;
    }
    
    @GetMapping
    public List<Contacts> getAll() {
        return contactsList;
    }

   @GetMapping("/{id}")
    public Contacts getById(@PathVariable int id) {

        for (Contacts c : contactsList) {
            if (c.getId() == id) {
                return c;
            }
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {

        contactsList.removeIf(c -> c.getId() == id);
        return "Deleted successfully";
    }
}