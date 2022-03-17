package com.transdev.busticket.repositories;


import com.transdev.busticket.models.entities.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {


}
