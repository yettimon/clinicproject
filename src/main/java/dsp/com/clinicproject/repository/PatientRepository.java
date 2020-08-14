package dsp.com.clinicproject.repository;

import dsp.com.clinicproject.model.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatientRepository extends MongoRepository<Patient, String > {
}
