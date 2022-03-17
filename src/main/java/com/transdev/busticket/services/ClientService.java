package com.transdev.busticket.services;


import com.transdev.busticket.exceptions.TransDevException;
import com.transdev.busticket.models.entities.Client;
import com.transdev.busticket.services.interfaces.IClientService;

import java.util.List;

public class ClientService implements IClientService {


    @Override
    public List<Client> getAllClients() throws TransDevException {
        return null;
    }

    @Override
    public Client getClientById(long idClient) throws TransDevException {
        return null;
    }

    @Override
    public Client createClient(Client client) throws TransDevException {
        return null;
    }

    @Override
    public void deleteClientById(long idClient) throws TransDevException {

    }
}
