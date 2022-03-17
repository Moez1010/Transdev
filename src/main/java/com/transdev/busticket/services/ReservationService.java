package com.transdev.busticket.services;


import com.transdev.busticket.exceptions.TransDevException;
import com.transdev.busticket.models.PaymentMeans;
import com.transdev.busticket.models.entities.Reservation;
import com.transdev.busticket.repositories.ReservationRepository;
import com.transdev.busticket.services.interfaces.IReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService implements IReservationService {

    @Override
    public List<Reservation> getAllReservation() throws TransDevException {
        return null;
    }

    @Override
    public Reservation getReservationById(long reservationId) throws TransDevException {
        return null;
    }

    @Override
    public Reservation createReservation(Reservation reservation) throws TransDevException {
        return null;
    }

    @Override
    public void deleteReservation(long reservationId) throws TransDevException {

    }

    @Override
    public boolean payReservation(long reservationId, PaymentMeans moyenPaiment) throws TransDevException {
        return false;
    }
}
