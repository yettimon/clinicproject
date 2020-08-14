package dsp.com.clinicproject.form;

import dsp.com.clinicproject.model.Doctor;
import dsp.com.clinicproject.model.Patient;

import java.time.LocalDateTime;

public class ReviewForm {

    private String id;
    private Doctor doctor;
    private Patient patient;
    private LocalDateTime dateOfReview;
    private String diagnose;
    private double price;


    public ReviewForm() {
    }

    public ReviewForm(Doctor doctor, Patient patient, LocalDateTime dateOfReview, String diagnose, double price) {
        this.doctor = doctor;
        this.patient = patient;
        this.dateOfReview = dateOfReview;
        this.diagnose = diagnose;
        this.price = price;
    }


    public ReviewForm(String id,
                      Doctor doctor,
                      Patient patient,
                      LocalDateTime dateOfReview,
                      String diagnose,
                      double price) {
        this.id = id;
        this.doctor = doctor;
        this.patient = patient;
        this.dateOfReview = dateOfReview;
        this.diagnose = diagnose;
        this.price = price;
    }

    public ReviewForm(String id, Patient patient, Doctor doctor, String diagnose, LocalDateTime dateOfReview) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public LocalDateTime getDateOfReview() {
        return dateOfReview;
    }

    public void setDateOfReview(LocalDateTime dateOfReview) {
        this.dateOfReview = dateOfReview;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
