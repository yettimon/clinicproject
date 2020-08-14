package dsp.com.clinicproject.service.doctor.impls;

import dsp.com.clinicproject.datastorage.DataFake;
import dsp.com.clinicproject.model.Doctor;
import dsp.com.clinicproject.repository.DoctorRepository;
import dsp.com.clinicproject.repository.ReviewRepository;
import dsp.com.clinicproject.service.doctor.interfaces.IDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.time.LocalDateTime;
import java.util.List;
@Service
public class DoctorServiceImpl implements IDoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    @Autowired
    DataFake dataFake;

    @Override
    public Doctor create(Doctor doctor) {
        doctor.setCreatedAt(LocalDateTime.now());
        doctor.setUpdatedAt(LocalDateTime.now());
        return doctorRepository.save(doctor);
    }

    @Override
    public Doctor get(String id) {
        return doctorRepository.findById(id).orElse(null);
    }

    @Override
    public Doctor update(Doctor doctor) {

        doctor.setUpdatedAt(LocalDateTime.now());
        return doctorRepository.save(doctor);
    }

    @Override
    public Doctor delete(String id) {
        Doctor doctor = this.get(id);
        doctorRepository.deleteById(doctor.getId());
        return doctor;
    }

    @Override
    public List getAll(){
        return doctorRepository.findAll();
    }


   public void reloadDatabase (){
 //  datafake.init();


   }


}
