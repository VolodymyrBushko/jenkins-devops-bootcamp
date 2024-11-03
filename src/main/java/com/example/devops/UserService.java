package com.example.devops;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private static final List<User> USERS = List.of(
            new User(1, "firstName1", "middleName1", "lastName1"),
            new User(2, "firstName2", "middleName2", "lastName2"),
            new User(3, "firstName3", null, "lastName3")
    );

    public Optional<User> getUserById(int id) {
        return USERS.stream().filter(user -> user.id() == id).findFirst();
    }
}
