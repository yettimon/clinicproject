package dsp.com.clinicproject.controller.web;

import dsp.com.clinicproject.form.DoctorForm;
import dsp.com.clinicproject.form.PatientForm;
import dsp.com.clinicproject.model.Doctor;
import dsp.com.clinicproject.model.Patient;
import dsp.com.clinicproject.service.doctor.impls.DoctorServiceImpl;
import dsp.com.clinicproject.service.patient.impls.PatientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/web/patient")
public class PatientWebController {


    @Autowired
    PatientServiceImpl patientService;


    @RequestMapping("/list")
    String showAll(Model model) {
        model.addAttribute("list",patientService.getAll());


        return "patientList";
    }



    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    String deletePatient(@PathVariable("id") String id, Model model){
        patientService.delete(id);
        model.addAttribute("list",patientService.getAll());
        return "redirect:/web/patient/list";

    }
    @RequestMapping(value = "/reloadDB", method = RequestMethod.GET)
    String reloadDataBase()
    {
        patientService.reloadDatabase();
        return "redirect:/web/patient/list";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createPatient(Model model){
        PatientForm patientForm = new PatientForm();
        model.addAttribute("patientForm", patientForm);
        return "addPatientList";
    }


    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createPatient(Model model, @ModelAttribute("patientForm") PatientForm patientForm){
        Patient patient = new Patient();
        patient.setName(patientForm.getName());
        patient.setBirthDate(patientForm.getBirthDate());
        patientService.create(patient);
        model.addAttribute("patient", patientService.getAll());
        return "redirect:/web/patient/list";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updatePatient(@PathVariable("id") String id,Model model) {
        Patient patient = patientService.get(id);
        PatientForm patientForm = new PatientForm(
                patient.getId(),
                patient.getName(),
                patient.getBirthDate()
        );
        model.addAttribute("patientForm", patientForm);
        return "updatePatientList";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String updatePatient(Model model, @PathVariable("id") String id,
                               @ModelAttribute("patientForm") PatientForm patientForm){
        Patient patient = new Patient();
        patient.setId(id);
        patient.setName(patientForm.getName());
        patient.setBirthDate(patientForm.getBirthDate());
        patientService.create(patient);

        model.addAttribute("patientForm", patientService.getAll());
        return "redirect:/web/patient/list";
    }



}
