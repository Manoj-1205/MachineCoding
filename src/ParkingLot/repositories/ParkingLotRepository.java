package ParkingLot.repositories;

import ParkingLot.models.ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotRepository {
    private static List<ParkingLot> parkingLots = new ArrayList<>();

    public static ParkingLot save(ParkingLot parkingLot) {
        parkingLots.add(parkingLot);
        return parkingLot;
    }

    public ParkingLot findById(Long id){
        return parkingLots.stream().filter(parkingLot -> parkingLot.getId() == id).findFirst().orElse(null);
    }
}
