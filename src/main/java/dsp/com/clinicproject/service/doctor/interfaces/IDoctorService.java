package dsp.com.clinicproject.service.doctor.interfaces;

import dsp.com.clinicproject.model.Doctor;

import java.util.List;

public interface IDoctorService {


    Doctor create (Doctor doctor);
    Doctor get (String id);
    Doctor update (Doctor doctor);
    Doctor delete (String id);
    List getAll();

}
