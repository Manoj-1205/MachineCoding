package ParkingLot.models;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.sql.Date;

//@Data
//@Builder
@Getter
@Setter
@SuperBuilder
public  abstract class BaseModel {
    private Long id;
    private Date createdAt;
    private Date updatedAt;
}
