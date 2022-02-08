package Ashwini.Engineer.AirlineReservation.service;


import Ashwini.Engineer.AirlineReservation.entity.User;

public interface UserService {
    public User findUserByEmail(String email);
    public void saveUser(User user);
}