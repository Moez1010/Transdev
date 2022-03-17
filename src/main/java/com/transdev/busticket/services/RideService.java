package com.transdev.busticket.services;

import com.transdev.busticket.exceptions.TransDevException;
import com.transdev.busticket.models.entities.Bill;
import com.transdev.busticket.models.entities.Ride;
import com.transdev.busticket.repositories.RideRepository;
import com.transdev.busticket.services.interfaces.IBillService;
import com.transdev.busticket.services.interfaces.IٍRideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RideService implements IٍRideService {

    @Autowired
    RideRepository rideRepository;

    @Override
    public Ride createRide(Ride ride) throws TransDevException {
        return rideRepository.save(ride);
    }

    @Override
    public List<Ride> getAll() throws TransDevException {
        return Streamable.of(rideRepository.findAll()).toList();
    }

    @Override
    public Ride getById(Long id) throws TransDevException {
        return rideRepository.findById(id).get();
    }
}
