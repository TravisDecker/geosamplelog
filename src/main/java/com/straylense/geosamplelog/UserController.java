package com.straylense.geosamplelog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "id/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public UserEntity getUserById(@PathVariable("userId") UUID userId) throws NotFoundException {
        UserEntity user = userRepository.findById(userId)
                .orElseThrow(() -> new NotFoundException(String.format("User not found with Id %S", userId)));
        return user;
    }
}
