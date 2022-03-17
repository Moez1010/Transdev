package com.transdev.busticket.services;

import com.transdev.busticket.exceptions.TransDevException;
import com.transdev.busticket.models.entities.Bill;
import com.transdev.busticket.models.entities.Ride;
import com.transdev.busticket.services.interfaces.IBillService;
import com.transdev.busticket.services.interfaces.IٍRideService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RideService implements IٍRideService {


    @Override
    public Ride createRide(Ride ride) throws TransDevException {
        return null;
    }

    @Override
    public List<Ride> getAll() throws TransDevException {
        return null;
    }

    @Override
    public Ride getById() throws TransDevException {
        return null;
    }
}
