package in.h.service;

import java.util.List;

import in.h.entity.Patient;

public interface PatientService {
	
	public boolean savePatient(Patient patient);
	
	public List getAllPatients();
	public boolean deletePatient(long id);
	public Patient getPatientById(long id);

}
