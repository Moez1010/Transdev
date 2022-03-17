package com.transdev.busticket.services.interfaces;

import com.transdev.busticket.exceptions.TransDevException;
import com.transdev.busticket.models.PaymentMeans;
import com.transdev.busticket.models.entities.Reservation;

import java.util.List;

public interface IReservationService {

    List<Reservation> getAllReservation() throws TransDevException;
    Reservation getReservationById(long idReservation) throws TransDevException;
    Reservation createReservation(Reservation reservation) throws TransDevException;
    void deleteReservation(long idReservation) throws TransDevException;
    boolean payReservation(long idReservation , PaymentMeans moyenPaiment) throws TransDevException;
}
