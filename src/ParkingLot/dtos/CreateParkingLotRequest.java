package ParkingLot.dtos;

import ParkingLot.generators.FloorId;
import ParkingLot.generators.ParkingSlotId;
import ParkingLot.models.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

//makes it easier for client to call our API
@Getter
@Setter
@Builder
public class CreateParkingLotRequest {
    private Long id;
    private String name;
    private String address;
    private Integer numberOfFloors;
    private Integer numberOfSlotsPerFloor;
    private Integer numberOfGates;

    //Mapper method
    public ParkingLot toParkingLot() {
        List<ParkingSpot> parkingSpotList = Collections.nCopies(numberOfSlotsPerFloor, ParkingSpot.mediumAvailable());
        parkingSpotList.forEach(parkingSpot -> parkingSpot.setId(ParkingSlotId.nextId()));

        List<ParkingFloor> parkingFloors = Collections.nCopies(numberOfFloors,
                    ParkingFloor.builder()
                            .parkingSpots(parkingSpotList)
                            .paymentCounter(PaymentCounter.builder().build())
                            .build()
                );
        parkingFloors.forEach(parkingFloor -> parkingFloor.setId(FloorId.nextId()));

        return ParkingLot.builder()
                .id(id)
                .name(name)
                .floors(parkingFloors)
                .entryGates(Collections.nCopies(numberOfGates, Gate.builder().build()))
                .exitGates(Collections.nCopies(numberOfGates, Gate.builder().build()))
                .build();

    }
}

