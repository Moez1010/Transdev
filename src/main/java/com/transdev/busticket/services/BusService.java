package com.transdev.busticket.services;

import com.transdev.busticket.exceptions.TransDevException;
import com.transdev.busticket.models.entities.Bus;
import com.transdev.busticket.services.interfaces.IBusService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BusService implements IBusService {


    @Override
    public List<Bus> getAllBus() throws TransDevException {
        return null;
    }

    @Override
    public Bus getBusById(Long busId) throws TransDevException {
        return null;
    }

    @Override
    public Bus createBus(Bus bus) throws TransDevException {
        return null;
    }

    @Override
    public void deleteBusById(Long busId) throws TransDevException {

    }
}
