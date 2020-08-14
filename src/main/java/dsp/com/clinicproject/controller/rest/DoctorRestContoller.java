package dsp.com.clinicproject.controller.rest;

import dsp.com.clinicproject.service.doctor.impls.DoctorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/doctor")
@RestController


public class DoctorRestContoller {
    public DoctorRestContoller(DoctorServiceImpl, doctorServiceImpl){
        this.doctorServiceImpl = doctorServiceImpl;
    }


    @Autowired
    DoctorServiceImpl doctorServiceImpl;
}
