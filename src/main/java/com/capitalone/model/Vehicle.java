package com.capitalone.model;

import com.capitalone.enums.VehicleType;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "vehicles")
public class Vehicle extends BaseAbstractEntity {

    @Column(name="vehicle_number", nullable = false)
    @NotNull
    private String regNo;

    @NotNull
    @Column(nullable = false)
    private String color;

    @NotNull
    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private VehicleType type;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name= "in_time", nullable = false)
    private Date inTime;
    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name= "out_time")
    private Date outTime;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "spot_id", referencedColumnName = "id")
    private Spot spot;

    public Vehicle (String regNo) {
        this.regNo = regNo;
    }

    public Vehicle(String regNo, String color, VehicleType type, Spot spot) {
        this.regNo = regNo;
        this.color = color;
        this.type = type;
        this.spot = spot;
    }


    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    public Spot getSpot() {
        return spot;
    }

    public void setSpot(Spot spot) {
        this.spot = spot;
    }
}
