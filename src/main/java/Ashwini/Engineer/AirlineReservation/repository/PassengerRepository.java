package Ashwini.Engineer.AirlineReservation.repository;


import Ashwini.Engineer.AirlineReservation.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger,Long> {
}
