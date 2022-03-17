package com.transdev.busticket.services;

import com.transdev.busticket.exceptions.TransDevException;
import com.transdev.busticket.models.entities.Bill;
import com.transdev.busticket.services.interfaces.IBillService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService implements IBillService {


    @Override
    public List<Bill> orderBills() throws TransDevException {
        return null;
    }

    @Override
    public Bill createBill(Bill bill) throws TransDevException {
        return null;
    }
}
