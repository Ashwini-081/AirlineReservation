//package Ashwini.Engineer.AirlineReservation.controller;
//
//import Ashwini.Engineer.AirlineReservation.entity.Passanger;
//import Ashwini.Engineer.AirlineReservation.service.PassangerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import javax.servlet.http.HttpServletRequest;
//
//@Controller
//public class PassangerController {
//    @Autowired
//    private PassangerService passangerService;
//     @Autowired
//    //Home
//    @GetMapping("/")
//    public String home(){
//            return "home";
//        }
//
//    //Registration- after registering user will go to login page
//    @GetMapping("/register")
//    public String registrationForm() {
//        return "register";
//    }
//
//    @PostMapping("/login")
//    public String registration(HttpServletRequest request) {
//        String userName = request.getParameter("userName");
//        String name = request.getParameter("name");
//        String address=request.getParameter("address");
//        String gender=request.getParameter("gender");
//        int age= Integer.parseInt(request.getParameter("age"));
//        String email = request.getParameter("email");
//        String password = request.getParameter("password");
//        long phoneNumber= Long.parseLong(request.getParameter("phoneNumber"));
//        Passanger passanger = new Passanger(userName, name,address,gender,age,email,password,phoneNumber);
//        passangerService.createPassanger(passanger);
//        return "login";
//    }
//
//    //Login - after login user will go to the list of flight page
//    @GetMapping("/login")
//    public String loginForm() {
//        return "login";
//    }
//
//    @GetMapping("/bookFlight")
//    public String bookFlight() {
//        return "bookFlight";
//    }
//
//
//    @GetMapping("/checkin")
//    public String checkinPage() {
//        return "checkin";
//    }
//
//
////    @GetMapping("/flights")
////    public String flights(Model model){
////        model.addAttribute("flights",flightService.FlightList());
////        return "flights";
////    }
//
////    @PostMapping("/flights")
////    public String login(HttpServletRequest request, Model model) {
////        String userName = request.getParameter("userName");
////        String password = request.getParameter("password");
////        Passanger passanger;
////        if (passangerService.existsById(userName)) {
////            passanger = passangerService.findPassangerByUserName(userName);
////            if (password.equals(passanger.getPassword())) {
////                model.addAttribute("userName", userName);
////                model.addAttribute("flights", flightService.FlightList() );
////            } else {
////                model.addAttribute("message", "Wrong Password");
////                return "login";
////                //return "redirect:/login";
////            }
////        } else {
////            model.addAttribute("message", "Please enter valid User Name");
////            return "login";
////            //return "redirect:/login";
////        }
////        return "flights";
////    }
//
//}
