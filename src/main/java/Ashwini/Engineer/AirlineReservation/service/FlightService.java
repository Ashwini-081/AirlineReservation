package Ashwini.Engineer.AirlineReservation.service;

import Ashwini.Engineer.AirlineReservation.entity.Flight;
import Ashwini.Engineer.AirlineReservation.repository.FlightRepository;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;

    public List<Flight> FlightList(){
        return flightRepository.findAll();
    }
    public Flight getByflightId(Integer flightId){
        return flightRepository.getById(flightId);
    }
}

