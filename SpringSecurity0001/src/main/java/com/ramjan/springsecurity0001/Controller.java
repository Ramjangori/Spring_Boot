package com.ramjan.springsecurity0001;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {

    List<String> list = new ArrayList<>();

    public Controller() {
        list.add("Ramjan");
        list.add("Rohit");
    }

    @GetMapping("/getUsers")
    public List<String> findUser() {
        return list;
    }

    @PostMapping("/addUsers/{user}")
    public List<String> findUser(@PathVariable("user") String u) {
        list.add(u);
        return list;
    }

    @GetMapping("/getdoctors")
    public List<String> getDoctors() {
        return Arrays.asList(
                "Dr. Sharma",
                "Dr. Verma"
        );
    }

    @GetMapping("/Students")
    public List<String> getStudents() {
        return Arrays.asList(
                "Aman",
                "Neha"
        );
    }

        @GetMapping("/")
        public String home() {
            return "Working";
        }

}
