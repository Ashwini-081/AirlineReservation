package Ashwini.Engineer.AirlineReservation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flight {
    @Id
    @Column(unique = true)
    private String flightName;
    @Column(unique = true)
    private Integer flightId;
    private String flightStatus;
    private int flightCapacity;
    private String destination;

    public Flight(String flightName, int flightId, String flightStatus, int flightCapacity, String destination) {
        this.flightName = flightName;
        this.flightId = flightId;
        this.flightStatus = flightStatus;
        this.flightCapacity = flightCapacity;
        this.destination = destination;
    }
    public Flight(){}

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(String flightStatus) {
        this.flightStatus = flightStatus;
    }

    public int getFlightCapacity() {
        return flightCapacity;
    }

    public void setFlightCapacity(int flightCapacity) {
        this.flightCapacity = flightCapacity;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
