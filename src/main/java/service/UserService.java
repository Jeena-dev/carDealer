package service;

import impl.UserRepositoryImpl;
import model.User;
import repository.UserRepository;

public class UserService {

    // UserService depends on UserRepository
    private final UserRepository userRepository;

//    public UserService(){
//       userRepository = new UserRepositoryImpl();
//    }

       // Dependency Injection
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void addUser(User user){
        userRepository.addUser(user);
    }
}
