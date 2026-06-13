package com.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.Repository.UserRepo;
import com.app.entity.User;

@Component
public class UserTest implements CommandLineRunner {

    @Autowired
    UserRepo repo;

    @Override
    public void run(String... args) throws Exception {

        User s1 = new User(1, "Ramjan", "Java");
        User s2 = new User(2, "Samir", "Java");
        User s3 = new User(3, "Surender Bajia", "Java");
        User s4 = new User(4, "Aman Raja", "Java");
        User s5 = new User(5, "prasoon Sir", "Java Full Stack");

        Iterable<User> users1 =
                repo.saveAll(Arrays.asList(s1, s2, s3, s4, s5));
//
//        Optional<User> op = repo.findById((long) 1);
//
//        if (op.isPresent()) {
//            User user = op.get();
//            System.out.println(user);
//        } else {
//            System.out.println("User not found");
//        }

        
        
    }
}