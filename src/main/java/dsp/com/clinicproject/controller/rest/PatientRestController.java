package dsp.com.clinicproject.controller.rest;
import dsp.com.clinicproject.model.Doctor;
import dsp.com.clinicproject.model.Patient;
import dsp.com.clinicproject.service.patient.impls.PatientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



import java.util.List;

@RequestMapping("/api/patient")
@RestController
public class PatientRestController {


    public PatientRestController(PatientServiceImpl patientServiceImpl) {
        this.patientServiceImpl= patientServiceImpl;
    }


    @Autowired
    PatientServiceImpl patientServiceImpl;

    @RequestMapping("")
    String getIndex() {
        return "<h1>Index Web Controller</h1>";
    }

    @GetMapping("/hello")
    String getHello() {
        return "<h1>Hello from Patient Controller</h1>";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    List getPatientList() {
        return patientServiceImpl.getAll();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    Patient getPatient(@PathVariable("id") String id) {
        return patientServiceImpl.get(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Patient createPatient(@RequestBody Patient patient) {
        return patientServiceImpl.create(patient);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    Patient updatePatient(@RequestBody Patient patient) {
        return patientServiceImpl.create(patient);
    }
}



