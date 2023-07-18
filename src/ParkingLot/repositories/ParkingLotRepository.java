package ParkingLot.repositories;

import ParkingLot.models.ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotRepository {
    private List<ParkingLot> parkingLots = new ArrayList<>();

    public ParkingLot findById(Long id){
        return parkingLots.stream().filter(parkingLot -> parkingLot.getId() == id).findFirst().orElse(null);
    }
}
