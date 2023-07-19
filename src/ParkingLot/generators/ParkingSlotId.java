package ParkingLot.generators;

import java.util.concurrent.atomic.AtomicLong;

public class ParkingSlotId {
    //Generate random long id using Atomic data types
    private static AtomicLong idCounter = new AtomicLong(0);

    public static Long nextId(){
        return idCounter.incrementAndGet();
    }
}
