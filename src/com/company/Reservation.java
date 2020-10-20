package com.company;

import java.util.List;
import java.util.Optional;

public class Reservation implements PlaneReservation {

    final Place[] standardPlace = new Place[28];
    final Place[] vipPlace = new Place[100];


    @Override
    public Optional<Integer> reservation(PlaceType placeType, String username, int price) {
        return Optional.empty();
    }

    @Override
    public Optional<Integer> cancel(int placeId) {
        return Optional.empty();
    }

    @Override
    public int status() {
        return 0;
    }

    @Override
    public List<Place> freePlaces() {
        return null;
    }

    @Override
    public List<Place> reservedPlaces() {
        return null;
    }

    @Override
    public boolean changePlaces(int sourcePlaceId, int destinationPlaceId) {
        return false;
    }
}
