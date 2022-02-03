package Ashwini.Engineer.AirlineReservation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;

@Entity
public class Booking {
    @Id
    @Column(unique = true)
    private String flightName;
    private String startingLocation;
    private String destination;
    private Date date;
    private Time time;
    private int numberOfSeats;

    public Booking(String flightName, String startingLocation, String destination, Date date, Time time, int numberOfSeats) {
        this.flightName = flightName;
        this.startingLocation = startingLocation;
        this.destination = destination;
        this.date = date;
        this.time = time;
        this.numberOfSeats = numberOfSeats;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getStartingLocation() {
        return startingLocation;
    }

    public void setStartingLocation(String startingLocation) {
        this.startingLocation = startingLocation;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Booking(){}


}
