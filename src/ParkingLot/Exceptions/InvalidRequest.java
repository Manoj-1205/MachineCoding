package ParkingLot.Exceptions;

public class InvalidRequest extends RuntimeException {
    public InvalidRequest(){
        super("Invalid Request");
    }
}
