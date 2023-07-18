package ParkingLot.services;

//Service - Logic layer

import ParkingLot.models.ParkingLot;
import ParkingLot.repositories.ParkingLotRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ParkingLotService {
    private ParkingLotRepository parkingLotRepository;
    public ParkingLot getParkingLot(Long id){
        System.out.println("Getting parking lot with Id : "+id+" -- "+parkingLotRepository.findById(id));
        return parkingLotRepository.findById(id);
    }
}
