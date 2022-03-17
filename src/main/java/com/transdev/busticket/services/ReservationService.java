package com.transdev.busticket.services;


import com.transdev.busticket.exceptions.TransDevException;
import com.transdev.busticket.models.CreditCard;
import com.transdev.busticket.models.PaymentMeans;
import com.transdev.busticket.models.Paypal;
import com.transdev.busticket.models.entities.Bill;
import com.transdev.busticket.models.entities.Reservation;
import com.transdev.busticket.repositories.ReservationRepository;
import com.transdev.busticket.services.interfaces.IReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService implements IReservationService {

    private static final int DISCOUNT= 5;

    @Autowired
    ReservationRepository reservationRepository;
    @Autowired
    BillService billService;
    @Override
    public List<Reservation> getAllReservation() throws TransDevException {
        return Streamable.of(reservationRepository.findAll()).toList();
    }

    @Override
    public Reservation getReservationById(long reservationId) throws TransDevException {
        return reservationRepository.findById(reservationId).get();
    }

    @Override
    public Reservation createReservation(Reservation reservation) throws TransDevException {
        return reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(long reservationId) throws TransDevException {
    }

    @Override
    public boolean payReservation(long reservationId, PaymentMeans paymentMeans) throws TransDevException {
        Optional<Reservation> reservation = reservationRepository.findById(reservationId);
        if(reservation.isPresent()) {
            reservation.get().getRides().stream().filter(ride -> ride.getPrice() >= 100).forEach(ride -> ride.setPrice(ride.getPrice() * (100 - DISCOUNT)/100));
            reservationRepository.save(reservation.get());
            if(paymentMeans.payReservation(reservationId)) {
                String type="";
                if(paymentMeans instanceof CreditCard){
                    type= "CreditCard";
                }
                else if(paymentMeans instanceof Paypal){
                    type ="Paypal";
                }
                Bill bill = new Bill(type,reservation.get());
                billService.createBill(bill);
                return true;
            }
        }
        return false;
    }
}
