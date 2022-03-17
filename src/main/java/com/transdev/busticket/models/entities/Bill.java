package com.transdev.busticket.models.entities;

import javax.persistence.*;
@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String paymentMean;
    @OneToOne
    @JoinColumn(name="Reservation_id",referencedColumnName="id")
    private Reservation reservation;

    public Bill() {
    }

    public Bill(String paymentMean, Reservation reservation) {
        this.paymentMean = paymentMean;
        this.reservation = reservation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPaymentMean() {
        return paymentMean;
    }

    public void setPaymentMean(String paymentMean) {
        this.paymentMean = paymentMean;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
