package com.transdev.busticket.controllers;

import com.transdev.busticket.models.entities.Client;
import com.transdev.busticket.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clients")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping()
    public List<Client> getAllClients() {
        return  null;
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable("id") Long id) {
        return  null;
    }

    @PostMapping()
    public Client createClient(@RequestBody Client client){
        return null;
    }

    @DeleteMapping("/{id}")
    public  void deleteClient(@PathVariable("id") Long id){
        return;
    }
}
