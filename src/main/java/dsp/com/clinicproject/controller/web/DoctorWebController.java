package dsp.com.clinicproject.controller.web;

import dsp.com.clinicproject.form.DoctorForm;
import dsp.com.clinicproject.model.Doctor;

import dsp.com.clinicproject.service.doctor.impls.DoctorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/web/doctor")
public class DoctorWebController {

    @Autowired
    DoctorServiceImpl doctorService;


    @RequestMapping("/list")
    String showAll(Model model) {
        model.addAttribute("list",doctorService .getAll());


        return "doctorList";
    }



    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    String deleteDoctor(@PathVariable("id") String id, Model model){
        doctorService.delete(id);
        model.addAttribute("list",doctorService.getAll());
        return "redirect:/web/doctor/list";

    }
    @RequestMapping(value = "/reloadDB", method = RequestMethod.GET)
    String reloadDataBase()
    {
        doctorService.reloadDatabase();
        return "redirect:/web/doctor/list";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createDoctor(Model model){
        DoctorForm doctorForm = new DoctorForm();
        model.addAttribute("doctorForm", doctorForm);
        return "addDoctorList";
    }


    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createDoctor(Model model, @ModelAttribute("doctorForm") DoctorForm doctorForm){
        Doctor doctor = new Doctor();
        doctor.setName(doctorForm.getName());
        doctor.setCategory(doctorForm.getCategory());
        doctor.setSpeciality(doctorForm.getSpeciality());
        doctorService.create(doctor);
        model.addAttribute("doctor", doctorService.getAll());
        return "redirect:/web/doctor/list";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateDoctor(@PathVariable("id") String id,Model model) {
        Doctor doctor = doctorService.get(id);
        DoctorForm doctorForm = new DoctorForm(
                doctor.getId(),
                doctor.getName(),
                doctor.getCategory(),
                doctor.getSpeciality()
        );
        model.addAttribute("doctorForm", doctorForm);
        return "updateDoctorList";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String updateDoctor(Model model, @PathVariable("id") String id,
                                @ModelAttribute("doctorForm") DoctorForm doctorForm){
        Doctor doctor = new Doctor();
        doctor.setId(id);
        doctor.setName(doctorForm.getName());
        doctor.setCategory(doctorForm.getCategory());
        doctor.setSpeciality(doctorForm.getSpeciality());
        doctorService.create(doctor);

        model.addAttribute("doctorForm", doctorService.getAll());
        return "redirect:/web/doctor/list";

    }




}
