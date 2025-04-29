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
import org.springframework.web.bind.annotation.ResponseBody;

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

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestParam String username, @RequestParam String password, HttpSession session) {
        User foundUser = userRepository.findByUsername(username);

        if (foundUser != null && foundUser.getPassword().equals(password)) {
            session.setAttribute("username", username);

            Map<String, Object> response = new HashMap<>();
            response.put("username", username);
            response.put("name", foundUser.getName());
            response.put("role", foundUser.getAccessLevel());

            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(401).body(Map.of("error", "Invalid username or password"));
        }
    }

    @GetMapping("/session-username")
    @ResponseBody
    public String getSessionUsername(HttpSession session) {
        return (String) session.getAttribute("username");
    }
}
