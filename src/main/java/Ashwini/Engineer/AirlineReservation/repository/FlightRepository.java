package Ashwini.Engineer.AirlineReservation.repository;

import Ashwini.Engineer.AirlineReservation.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
}
