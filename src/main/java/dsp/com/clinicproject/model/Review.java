package dsp.com.clinicproject.model;

import java.time.LocalDateTime;

public class Review {

    private String id;
    private Doctor doctor;
    private Patient patient;
    private LocalDateTime dateOfReview;
    private String diagnose;
    private double price;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAd;

    public Review() {
    }

    public Review(String id, Doctor doctor, Patient patient,
                  LocalDateTime dateOfReview, String diagnose, double price) {
        this.id = id;
        this.doctor = doctor;
        this.patient = patient;
        this.dateOfReview = dateOfReview;
        this.diagnose = diagnose;
        this.price = price;
    }

    public Review(Doctor doctor, Patient patient, LocalDateTime dateOfReview,
                  String diagnose, double price) {
        this.doctor = doctor;
        this.patient = patient;
        this.dateOfReview = dateOfReview;
        this.diagnose = diagnose;
        this.price = price;
    }

    public Review(String id, Doctor doctor, Patient patient, LocalDateTime dateOfReview,
                  String diagnose, double price, LocalDateTime createdAt,
                  LocalDateTime updatedAd) {
        this.id = id;
        this.doctor = doctor;
        this.patient = patient;
        this.dateOfReview = dateOfReview;
        this.diagnose = diagnose;
        this.price = price;
        this.createdAt = createdAt;
        this.updatedAd = updatedAd;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAd() {
        return updatedAd;
    }

    public void setUpdatedAd(LocalDateTime updatedAd) {
        this.updatedAd = updatedAd;
    }
}
