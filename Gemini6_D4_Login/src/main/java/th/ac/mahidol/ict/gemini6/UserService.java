package th.ac.mahidol.ict.gemini6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  // This makes UserService a Spring Bean
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User authenticate(String username, String password) {
        for (User user : userRepository.findAll()) {
            if (user.getName().equals(username) && user.getEmail().equals(password)) {
                return user;  // return user if credentials match
            }
        }
        return null;  // return null if no match found
    }
}
