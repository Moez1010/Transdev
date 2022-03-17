package com.transdev.busticket.services.interfaces;

import com.transdev.busticket.exceptions.TransDevException;
import com.transdev.busticket.models.entities.Bill;

import java.util.List;

public interface IBillService {

    List<Bill> orderBills() throws TransDevException;
    Bill createBill(Bill bill) throws TransDevException;
}
