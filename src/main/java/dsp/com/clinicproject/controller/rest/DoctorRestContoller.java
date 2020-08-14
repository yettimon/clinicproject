package dsp.com.clinicproject.controller.rest;
import dsp.com.clinicproject.model.Doctor;
import dsp.com.clinicproject.service.doctor.impls.DoctorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



import java.util.List;

@RequestMapping("/api/doctor")
@RestController

public class DoctorRestContoller {



    public DoctorRestContoller(DoctorServiceImpl doctorServiceImpl) {
        this.doctorServiceImpl = doctorServiceImpl;
    }


    @Autowired
    DoctorServiceImpl doctorServiceImpl;

    @RequestMapping("")
    String getIndex() {
        return "<h1>Index Web Controller</h1>";
    }

    @GetMapping("/hello")
    String getHello() {
        return "<h1>Hello from Doctor Controller</h1>";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    List getCafedrasList() {
        return doctorServiceImpl.getAll();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    Doctor getDoctor(@PathVariable("id") String id) {
        return doctorServiceImpl.get(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Doctor createDoctor(@RequestBody Doctor doctor) {
        return doctorServiceImpl.create(doctor);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    Doctor updateDoctor(@RequestBody Doctor doctor) {
        return doctorServiceImpl.create(doctor);
    }
}

