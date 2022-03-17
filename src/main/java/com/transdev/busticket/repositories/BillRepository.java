package com.transdev.busticket.repositories;


import com.transdev.busticket.models.entities.Bill;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends CrudRepository<Bill, Long> {


}
