package ParkingLot.models;

import ParkingLot.dtos.CreateParkingLotRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@SuperBuilder
public class ParkingLot extends BaseModel {

    private String name;
    private String address;


    private List<ParkingFloor> floors = new ArrayList<>();


    private List<Gate> entryGates = new ArrayList<>();


    private List<Gate> exitGates = new ArrayList<>();


}
