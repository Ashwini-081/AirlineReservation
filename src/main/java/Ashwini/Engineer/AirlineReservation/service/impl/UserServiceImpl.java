package Ashwini.Engineer.AirlineReservation.service.impl;



import java.util.Arrays;
import java.util.HashSet;

import Ashwini.Engineer.AirlineReservation.entity.Role;
import Ashwini.Engineer.AirlineReservation.entity.User;
import Ashwini.Engineer.AirlineReservation.repository.RoleRepository;
import Ashwini.Engineer.AirlineReservation.repository.UserRepository;
import Ashwini.Engineer.AirlineReservation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;



@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
        Role userRole = roleRepository.findByRole("ADMIN");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        userRepository.save(user);
    }

}