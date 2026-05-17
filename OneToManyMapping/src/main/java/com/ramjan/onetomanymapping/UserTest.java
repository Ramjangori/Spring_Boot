package com.ramjan.onetomanymapping;

import com.ramjan.onetomanymapping.entity.Order;
import com.ramjan.onetomanymapping.entity.User;
import com.ramjan.onetomanymapping.repository.OrderRepo;
import com.ramjan.onetomanymapping.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;

@Component
public class UserTest implements CommandLineRunner {
    @Autowired
    private OrderRepo repo;
    @Override
    public void run(String... args) throws Exception {

         User u1 = new User(1,"Ramjan");
         User u2 = new User(2,"Aman Khan");

         Order o1 = new Order(1,"kurkure",new Date(),u1);
        Order o2 = new Order(2,"kurkure",new Date(),u2);
        Order o3 = new Order(3,"Biscuit",new Date(),u1);


     repo.saveAll(Arrays.asList(o1,o2,o3));




    }
}
