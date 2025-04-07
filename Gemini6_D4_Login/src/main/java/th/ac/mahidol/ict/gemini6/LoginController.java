package th.ac.mahidol.ict.gemini6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired  // This will inject UserService into LoginController
    private UserService userService;

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";  // Renders login.html
    }

    @PostMapping("/login")
    public String login(Model model, @RequestParam String username, @RequestParam String password) {
        User user = userService.authenticate(username, password);
        if (user != null) {
            model.addAttribute("username", username);
            return "greeting"; // Redirect to a welcome page or dashboard
        } else {
            model.addAttribute("error", "Invalid username or password.");
            return "login-error"; // Return to login page with error message
        }
    }
}
