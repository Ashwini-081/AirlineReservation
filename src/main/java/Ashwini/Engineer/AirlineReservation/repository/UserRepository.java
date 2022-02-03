package Ashwini.Engineer.AirlineReservation.repository;

import Ashwini.Engineer.AirlineReservation.entity.Passanger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<Passanger,Long>{

    Passanger findByUserName(String userName);

}
