package dsp.com.clinicproject.service.patient.impls;

import dsp.com.clinicproject.model.Doctor;
import dsp.com.clinicproject.model.Patient;
import dsp.com.clinicproject.repository.DoctorRepository;
import dsp.com.clinicproject.repository.PatientRepository;
import dsp.com.clinicproject.repository.ReviewRepository;
import dsp.com.clinicproject.service.patient.interfaces.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PatientServiceImpl implements IPatientService {

    @Autowired
    PatientRepository patientRepository;

    @Override
    public Patient create(Patient patient) {
        patient.setCreatedAt(LocalDateTime.now());
        patient.setUpdatedAt(LocalDateTime.now());
        return patientRepository.save(patient);
    }

    @Override
    public Patient get(String id) {
        return patientRepository.findById(id).orElse(null);
    }

    @Override
    public Patient update(Patient patient) {

        patient.setUpdatedAt(LocalDateTime.now());
        return patientRepository.save(patient);
    }

    @Override
    public Patient delete(String id) {
        Patient patient = this.get(id);
        patientRepository.deleteById(patient.getId());
        return patient;
    }

    @Override
    public List getAll(){
        return patientRepository.findAll();
    }
}
