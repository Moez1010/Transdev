package com.transdev.busticket.controllers;

import com.transdev.busticket.models.entities.Bill;
import com.transdev.busticket.services.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bills")
public class BillController {
    @Autowired
    BillService billService;

    @GetMapping()
    public List<Bill> orderBills() {
        return  null;
    }

}
