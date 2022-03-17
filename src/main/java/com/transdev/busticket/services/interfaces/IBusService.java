package com.transdev.busticket.services.interfaces;

import com.transdev.busticket.exceptions.TransDevException;
import com.transdev.busticket.models.entities.Bus;

import java.util.List;

public interface IBusService {

    List<Bus> getAllBus() throws TransDevException;
    Bus getBusById(Long busId) throws TransDevException;
    Bus createBus(Bus bus) throws TransDevException;
    void deleteBusById(Long busId) throws TransDevException;

}
