package com.transdev.busticket.repositories;

import com.transdev.busticket.models.entities.Ride;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends CrudRepository<Ride, Long> {


}
