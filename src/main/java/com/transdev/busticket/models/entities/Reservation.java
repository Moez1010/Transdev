package com.transdev.busticket.models.entities;

import javax.persistence.*;
import java.util.List;
@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id")
    private Bus bus;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "reservation_ride", joinColumns = { @JoinColumn(name = "reservation_id") }, inverseJoinColumns = {
            @JoinColumn(name = "ride_id") })
    private List<Ride> rides;

    public Reservation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public List<Ride> getRides() {
        return rides;
    }

    public void setRides(List<Ride> rides) {
        this.rides = rides;
    }
}
