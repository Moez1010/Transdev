package com.transdev.busticket.services;

import com.transdev.busticket.exceptions.TransDevException;
import com.transdev.busticket.models.Paypal;
import com.transdev.busticket.models.entities.Bus;
import com.transdev.busticket.models.entities.Reservation;
import com.transdev.busticket.models.entities.Ride;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ReservationServiceTest {
    @Autowired
    ReservationService reservationService;
    @Autowired
    BillService billService;
    @Autowired
    RideService rideService;
    @Autowired
    BusService busService;

    Long reservationId;

    @BeforeAll
    void setUp() throws TransDevException {

        Bus bus= busService.createBus(new Bus(555));
        assertNotNull(bus);

        Reservation reservation = new Reservation();
        reservation.setBus(bus);
        List<Ride> rideList = new ArrayList<Ride>();
        Ride ride=  rideService.createRide(new Ride("17/03/2022","08:00",100,100,bus));
        assertNotNull(ride);

        Bus bus2= busService.createBus(new Bus(999));
        assertNotNull(bus2);
        rideList.add(ride);

        ride=  rideService.createRide(new Ride("17/03/2022","08:00",100,90,bus2));
        assertNotNull(ride);
        rideList.add(ride);

        reservation.setRides(rideList);
        reservation = reservationService.createReservation(reservation);
        assertNotNull(reservation);
        reservationId= reservation.getId();
    }
    @Test
    void createReservation() {
    }

    @Test
    void getAllReservation() {
    }

    @Test
    void getReservationById() {
    }

    @Test
    void deleteReservation() {
    }

    @Test
    void payReservation() throws TransDevException {
       boolean paupalstatus = reservationService.payReservation(reservationId,new Paypal());
        assertFalse(paupalstatus);
    }
}