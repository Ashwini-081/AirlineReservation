package Ashwini.Engineer.AirlineReservation.service;

import Ashwini.Engineer.AirlineReservation.entity.Flight_Details;

import java.util.List;

public interface Flight_DetailsService  {
    List<Flight_Details> getAllFlightDetails();

    Flight_Details saveFlight(Flight_Details flight);

    Flight_Details getflightById(Long id);

    Flight_Details updateFlight(Flight_Details flight);

    void deleteFlightById(Long id);
}
