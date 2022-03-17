package com.transdev.busticket.controllers;


import com.transdev.busticket.models.entities.Bus;
import com.transdev.busticket.services.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bus")
public class busController {

    @Autowired
    BusService busService;

    @GetMapping()
    public List<Bus> getAllBuss() {
        return  null;
    }

    @GetMapping("/{id}")
    public Bus getBusById(@PathVariable("id") Long id) {
        return  null;
    }

    @PostMapping()
    public Bus createBus(@RequestBody Bus bus){
        return null;
    }

    @DeleteMapping("/{id}")
    public  void deleteBus(@PathVariable("id") Long id){
        return;
    }
}
