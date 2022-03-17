package com.transdev.busticket.models;

public class Paypal extends PaymentMeans{

    private String email ;

    @Override
    public boolean payReservation(Long reservationId) {
        return true;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
