package com.transdev.busticket.repositories;


import com.transdev.busticket.models.entities.Bus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRepository extends CrudRepository<Bus, Long> {


}