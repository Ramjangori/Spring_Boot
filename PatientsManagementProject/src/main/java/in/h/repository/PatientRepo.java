package in.h.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.h.entity.Patient;

public interface PatientRepo  extends JpaRepository<Patient , Long>{

}
