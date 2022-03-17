package com.transdev.busticket.services;


import com.transdev.busticket.exceptions.TransDevException;
import com.transdev.busticket.models.PaymentMeans;
import com.transdev.busticket.models.entities.Reservation;
import com.transdev.busticket.services.interfaces.IReservationService;

import java.util.List;

public class ReservationService implements IReservationService {

    @Override
    public List<Reservation> getAllReservation() throws TransDevException {
        return null;
    }

    @Override
    public Reservation getReservationById(long idReservation) throws TransDevException {
        return null;
    }

    @Override
    public Reservation createReservation(Reservation reservation) throws TransDevException {
        return null;
    }

    @Override
    public void deleteReservation(long idReservation) throws TransDevException {

    }

    @Override
    public boolean payReservation(long idReservation, PaymentMeans moyenPaiment) throws TransDevException {
        return false;
    }
}
