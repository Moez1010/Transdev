package com.transdev.busticket.repositories;


import com.transdev.busticket.models.entities.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {


}
