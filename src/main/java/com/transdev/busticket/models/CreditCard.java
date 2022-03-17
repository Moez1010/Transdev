package com.transdev.busticket.models;

public class CreditCard extends PaymentMeans{

    private String numeroCard ;

    private String dateExpiration;

    @Override
    public boolean payReservation(Long reservationId) {
        return true;
    }

    public String getNumeroCard() {
        return numeroCard;
    }

    public void setNumeroCard(String numeroCard) {
        this.numeroCard = numeroCard;
    }

    public String getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(String dateExpiration) {
        this.dateExpiration = dateExpiration;
    }
}
