package dsp.com.clinicproject.repository;

import dsp.com.clinicproject.model.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DoctorRepository extends MongoRepository<Doctor, String> {
}
