package ParkingLot.Exceptions;

public class ParkingLotNullException extends RuntimeException {
    public ParkingLotNullException(){
        super("ID is required");
    }
}
