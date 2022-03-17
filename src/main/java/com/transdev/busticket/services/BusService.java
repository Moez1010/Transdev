package com.transdev.busticket.services;

import com.transdev.busticket.exceptions.TransDevException;
import com.transdev.busticket.models.entities.Bus;
import com.transdev.busticket.repositories.BusRepository;
import com.transdev.busticket.services.interfaces.IBusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BusService implements IBusService {

    @Autowired
    BusRepository busRepository;

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
        return busRepository.save(bus);
    }

    @Override
    public void deleteBusById(Long busId) throws TransDevException {

    }
}
