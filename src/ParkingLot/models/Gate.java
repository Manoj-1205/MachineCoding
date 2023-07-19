package ParkingLot.models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder

public class Gate extends BaseModel{
    private Integer gateNumber;
    private Operator operator;
    private PaymentCounter paymentCounter;
    private DisplayBoard displayBoard;
}
