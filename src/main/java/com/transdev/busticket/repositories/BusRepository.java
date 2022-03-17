package com.transdev.busticket.repositories;


import com.transdev.busticket.models.entities.Bus;
import org.springframework.data.repository.CrudRepository;

public interface BusRepository extends CrudRepository<Bus, Long> {


}