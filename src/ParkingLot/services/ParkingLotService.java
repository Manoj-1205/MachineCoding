package ParkingLot.services;

//Service - Logic layer

import ParkingLot.models.ParkingFloor;
import ParkingLot.models.ParkingLot;
import ParkingLot.repositories.ParkingLotRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ParkingLotService {
    private ParkingLotRepository parkingLotRepository;
    private SlotService slotService;
    public ParkingLot getParkingLot(Long id){
        System.out.println("Getting parking lot with Id : "+id+" -- "+parkingLotRepository.findById(id));
        return parkingLotRepository.findById(id);
    }

    public ParkingLot createParkingLot(ParkingLot parkingLot){
        ParkingLot savedLot = ParkingLotRepository.save(parkingLot);
        savedLot.getFloors().stream().forEach(parkingFloor ->
            slotService.createParkingSlots(parkingFloor.getParkingSpots())
        );
        return savedLot;
    }

}
