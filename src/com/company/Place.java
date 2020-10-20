package com.company;

class Place {

    public Place(int id, String username, PlaneReservation.PlaceType placeType) {
        this.id = id;
        this.username = username;
        this.placeType = placeType;
    }

    private int id;
    private String username;
    private PlaneReservation.PlaceType placeType;


}