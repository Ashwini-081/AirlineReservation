package Ashwini.Engineer.AirlineReservation.service.impl;

import Ashwini.Engineer.AirlineReservation.entity.Flight_Details;
import Ashwini.Engineer.AirlineReservation.repository.Flight_DetailsRepository;
import Ashwini.Engineer.AirlineReservation.service.Flight_DetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Flight_DetailsServiceImpl implements Flight_DetailsService {


    private Flight_DetailsRepository flight_detailsRepository;

    public Flight_DetailsServiceImpl(Flight_DetailsRepository flight_detailsRepository) {
        super();
        this.flight_detailsRepository = flight_detailsRepository;
    }

    @Override
    public List<Flight_Details> getAllFlightDetails() {
        return flight_detailsRepository.findAll();
    }

    @Override
    public Flight_Details saveFlight(Flight_Details flight) {
        return flight_detailsRepository.save(flight);
    }

    @Override
    public Flight_Details getflightById(Long id) {
        return flight_detailsRepository.findById(id).get();
    }

    @Override
    public Flight_Details updateFlight(Flight_Details flight) {
        return flight_detailsRepository.save(flight);
    }

    @Override
    public void deleteFlightById(Long id) {
        flight_detailsRepository.deleteById(id);

    }
}
