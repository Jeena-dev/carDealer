package repository;

import exception.DuplicateUserException;
import exception.UserNotFoundException;
import model.User;

//Define operations for User data.
public interface UserRepository {
    void addUser(User user)throws DuplicateUserException;

    User getUserByUsername(String username) throws UserNotFoundException;
}
