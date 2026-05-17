//package com.ramjan.test;
//
//import com.ramjan.Repository.PersonRepo;
//import com.ramjan.entity.Laptop;
//import com.ramjan.entity.Person;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class PersonTest implements CommandLineRunner {
//     @Autowired
//     PersonRepo repo;
//    @Override
//    public void run(String... args) throws Exception {
//         Person p = new Person();
//         p.setName("Ramjan gori");
//         p.setEmail("ramjangori6666@gmail.com");
//
//         Laptop laptop = new Laptop();
//         laptop.setModelNumber(23443);
//         laptop.setBrand("Hp");
//         p.setLaptop(laptop);
//
//          Person saved = repo.save(p);
//          System.out.println(saved.getName() + "Saved sucessfully");
//    }
//}
