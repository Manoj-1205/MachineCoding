package ParkingLot.controllers;

//Request Layer - Accepts the request from client and pass it to service layer
//Controllers have two small responsibilities
// 1. Request Level Validation -> Only for the request
// 2. Date transformation -> Map request or response data

import ParkingLot.Exceptions.InvalidRequest;
import ParkingLot.Exceptions.ParkingLotNullException;
import ParkingLot.dtos.CreateParkingLotRequest;
import ParkingLot.models.ParkingLot;
import ParkingLot.services.ParkingLotService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ParkingLotController {

    private ParkingLotService parkingLotService;
    public ParkingLot getParkingLot(Long id){
        validateId(id);
        return parkingLotService.getParkingLot(id);
    }

    private static void validateId(Long id) {
        if(id == null){
            throw new ParkingLotNullException();
        }
    }

    public ParkingLot createParkingLot(CreateParkingLotRequest request){
        validateRequest(request);
        return parkingLotService.createParkingLot(request.toParkingLot());
    }

    private static void validateRequest(CreateParkingLotRequest request) {
        if(request.getNumberOfFloors() == null && request.getNumberOfSlotsPerFloor()==null){
            throw new InvalidRequest();
        }


    }

}

//Requests from Parking lot - APIs
//We need all the CRUD APIs
//CREATE - POST /parking-lot
//READ - GET /parking-lot/:id


