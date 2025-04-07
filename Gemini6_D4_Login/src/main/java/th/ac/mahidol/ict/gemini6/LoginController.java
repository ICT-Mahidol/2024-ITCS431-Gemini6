package th.ac.mahidol.ict.gemini6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";  // Renders login.html
    }

    @PostMapping("/login")
    public String login(Model model, @RequestParam String username, @RequestParam String password) {
        for (User user : userRepository.findAll()) {
            if (user.getName().equals(username) && user.getEmail().equals(password)) {
                model.addAttribute("username", username);
                return "greeting"; // Redirect to a welcome page or dashboard
            }
        }
        model.addAttribute("error", "Invalid username or password.");
        return "login-error"; // Return to login page with error message
    }
}
