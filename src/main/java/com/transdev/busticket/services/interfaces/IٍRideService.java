package com.transdev.busticket.services.interfaces;

import com.transdev.busticket.exceptions.TransDevException;
import com.transdev.busticket.models.entities.Ride;

import java.util.List;

public interface IٍRideService {

    Ride createRide(Ride ride) throws TransDevException;
    List<Ride> getAll() throws TransDevException;
    Ride getById(Long id) throws TransDevException;
}
