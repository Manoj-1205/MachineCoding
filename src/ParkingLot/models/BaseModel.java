package ParkingLot.models;

import lombok.Data;

import java.sql.Date;

@Data
public abstract class BaseModel {
    private long id;
    private Date createdAt;
    private Date updatedAt;
}
