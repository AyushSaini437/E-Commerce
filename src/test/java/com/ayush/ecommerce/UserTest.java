package com.ayush.ecommerce;

import com.ayush.ecommerce.entity.User;
import com.ayush.ecommerce.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest // Integration Test
public class UserTest {

    @Autowired
    private UserRepository userRepository;

    @Test  // Unit Test
    public void testUserRepository(){
        List<User> users = userRepository.findAll();
        System.out.println(users);
    }
}
