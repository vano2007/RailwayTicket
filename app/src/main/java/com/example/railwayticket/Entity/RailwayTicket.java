package com.example.railwayticket.Entity;

public class RailwayTicket {

    // задание полей сущности (её характеристик)
    private String departurePoint; // место отправления
    private String arrivalPoint; // место прибытия
    private String departureDate; // время отправления
    private String arrivalDate; // время прибытия
    private String travelTime; // время пути
    private int distance; // расстояние пути
    private float ticketPrice; // стоимость билета

    public RailwayTicket() {
    }

    public RailwayTicket(String departurePoint, String arrivalPoint, String departureDate, String travelTime, float ticketPrice) {
        this.departurePoint = departurePoint;
        this.arrivalPoint = arrivalPoint;
        this.departureDate = departureDate;
        this.travelTime = travelTime;
        this.ticketPrice = ticketPrice;
    }
}
