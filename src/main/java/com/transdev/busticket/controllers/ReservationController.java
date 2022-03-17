package com.transdev.busticket.controllers;

import com.transdev.busticket.models.entities.Reservation;
import com.transdev.busticket.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/api/v1/reservations")
public class ReservationController {

    @Autowired
    ReservationService reservationService;

    @GetMapping()
    public List<Reservation> getAllReservations() {
        return  null;
    }

    @GetMapping("/{id}")
    public Reservation getReservationById(@PathVariable("id") Long id) {
        return  null;
    }

    @PutMapping("/{id}")
    public Reservation payReservationById(@PathVariable("id") Long id) {
        return  null;
    }

    @PostMapping()
    public Reservation createReservation(@RequestBody Reservation reservation){
        return null;
    }

    @DeleteMapping("/{id}")
    public  void deleteReservation(@PathVariable("id") Long id){
        return;
    }
}
