//package Ashwini.Engineer.AirlineReservation.service;
//
//import Ashwini.Engineer.AirlineReservation.entity.Passanger;
//import Ashwini.Engineer.AirlineReservation.repository.PassangerRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class PassangerService {
//    @Autowired
//    private PassangerRepository passangerRepository;
//
//    public Passanger createPassanger(Passanger passanger){
//        return passangerRepository.save(passanger);
//    }
//
//    public Boolean existsById(String userName){
//        return passangerRepository.existsById(userName);
//    }
//    public Passanger findPassangerByUserName(String userName){
//        return passangerRepository.getById(userName);
//    }
//}
//
//
//
