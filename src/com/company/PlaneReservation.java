package com.company;

import java.util.List;
import java.util.Optional;

public interface PlaneReservation {

    enum PlaceType {
        STANDARD,
        VIP
    }


    PlaceType standard = PlaceType.STANDARD;
    PlaceType vip = PlaceType.VIP;

    Optional<Integer> reservation(final PlaceType placeType, final String username, int price);
    Optional<Integer> cancel(int placeId);
    int status();
    List<Place> freePlaces();
    List<Place> reservedPlaces();
    boolean changePlaces(int sourcePlaceId, int destinationPlaceId);
}