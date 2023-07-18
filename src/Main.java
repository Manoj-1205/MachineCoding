import ParkingLot.controllers.ParkingLotController;
import ParkingLot.repositories.ParkingLotRepository;
import ParkingLot.services.ParkingLotService;

public class Main {
    private static ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
    private static ParkingLotService parkingLotService=new ParkingLotService(parkingLotRepository);
    private static  ParkingLotController parkingLotController=new ParkingLotController(parkingLotService);
    public static void main(String[] args) {


        parkingLotController.getParkingLot(1L);
    }
}