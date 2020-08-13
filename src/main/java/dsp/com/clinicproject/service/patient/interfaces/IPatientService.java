package dsp.com.clinicproject.service.patient.interfaces;

import dsp.com.clinicproject.model.Doctor;
import dsp.com.clinicproject.model.Patient;

import java.util.List;

public interface IPatientService {



    Patient create (Patient patient);
    Patient get (String id);
    Patient update (Patient patient);
    Patient delete (String id);

    List getAll();
}

