package com.transdev.busticket.services.interfaces;


import com.transdev.busticket.exceptions.TransDevException;
import com.transdev.busticket.models.entities.Client;

import java.util.List;

public interface IClientService {

    List<Client> getAllClients() throws TransDevException;
    Client getClientById(long idClient) throws TransDevException;
    Client createClient(Client client) throws TransDevException;
    void deleteClientById(long idClient) throws TransDevException;
}
