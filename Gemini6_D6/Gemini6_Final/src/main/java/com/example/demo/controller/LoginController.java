package com.example.demo.controller;

import com.example.demo.UserRepository;
import com.example.demo.model.User;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }
//
//    @PostMapping("/login")
//    public String login(Model model, @RequestParam String username, @RequestParam String password) {
//        for (User user : userRepository.findAll()) {
//            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
//                model.addAttribute("username", username);
//                model.addAttribute("name", user.getName());
//                model.addAttribute("role", user.getAccessLevel());
//
//                if ("Astronomer".equalsIgnoreCase(user.getAccessLevel())) {
//                    return "redirect:/allsp";
//                }
//
//                // Handle other user roles (observer, operator, etc.)
//                switch (user.getAccessLevel().toLowerCase()) {
//                    case "science observer":
//                        return "observer-dashboard"; // Redirect to observer dashboard
//                    case "telescope operator":
//                        return "operator-dashboard"; // Redirect to operator dashboard
//                    default:
//                        return "default-dashboard"; // Fallback
//                }
//            }
//        }
//        model.addAttribute("error", "Invalid username or password.");
//        return "login-error"; // Return to login page with error message
//    }


    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestParam String username, @RequestParam String password, HttpSession session) {
        // Here you can implement your custom authentication logic (check the database, etc.)
        User foundUser = userRepository.findByUsername(username);

        if (foundUser != null && foundUser.getPassword().equals(password)) {
            // If the user exists and the password matches, store the username in session
            session.setAttribute("username", username);  // Save the username to the session

            // Create a response map with user information
            Map<String, Object> response = new HashMap<>();
            response.put("username", username);
            response.put("name", foundUser.getName());
            response.put("role", foundUser.getAccessLevel());

            // Return the user info as JSON
            return ResponseEntity.ok(response);
        } else {
            // If the username/password is incorrect, return error as JSON
            return ResponseEntity.status(401).body(Map.of("error", "Invalid username or password"));
        }
    }

}
