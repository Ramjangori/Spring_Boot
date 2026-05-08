package com.h;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.h.Repository.PatientRepo;
import com.h.entity.BloodGroupDto;
import com.h.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.jdbc.core.SqlOutParameter;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class HospitalManagement2Application implements CommandLineRunner {
    @Autowired
    PatientRepo repo;
    public static void main(String[] args) {
        SpringApplication.run(HospitalManagement2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//         Optional<Patient> p = repo.findById(1l);
//         List<Patient> list = repo.findByIdOrEmail(3,"ramjangori6666@gmail.com");
//         List<Patient> p2 = repo.findByBirthDateIsGreaterThan(LocalDate.of(2002,3,9));
//         if(p.isPresent()){
//             System.out.println(p.get());
//         }
//         else{
//             System.out.println("Patient not found");
//         }
//         System.out.println(list);
//         System.out.println(p2);

//        List<BloodGroupDto> countBloodGroup = repo.findCountOfBloodGroup();
//         for(BloodGroupDto b : countBloodGroup){
//             System.out.println(b);
//         }
         Page<Patient> patients = repo.findAll(PageRequest.of(0,5));
            for(Patient p : patients){
                System.out.println(p);
            }
          System.out.println(patients.getTotalPages());
    }
}
