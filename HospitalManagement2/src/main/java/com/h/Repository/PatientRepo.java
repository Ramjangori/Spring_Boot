package com.h.Repository;

import com.h.entity.BloodGroupDto;
import com.h.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PatientRepo extends JpaRepository<Patient,Long> {


    List<Patient> findByIdOrEmail(long id , String email);

    @Query("select p from Patient p where p.birthDate > ?1")
    List<Patient> findByBirthDateIsGreaterThan(LocalDate birthdate);


     @Query("""
          select new com.h.entity.BloodGroupDto(p.bloodGroup , count(p))
          from Patient p group by p.bloodGroup""")
     List<BloodGroupDto>  findCountOfBloodGroup();
}
