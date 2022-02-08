package Ashwini.Engineer.AirlineReservation;

import Ashwini.Engineer.AirlineReservation.entity.Flight_Details;
import Ashwini.Engineer.AirlineReservation.repository.Flight_DetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AirlineReservationApplication  {

	public static void main(String[] args) {
		SpringApplication.run(AirlineReservationApplication.class, args);
		System.out.println("Exicuted");

	}


}
