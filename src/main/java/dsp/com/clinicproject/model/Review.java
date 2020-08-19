package dsp.com.clinicproject.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document
public class Review {


    @Id
    private String id;
    private Doctor doctor;
    private Patient patient;
    private String dateOfReview;
    private String diagnose;
    private double price;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Review() {
    }

    public Review(String id, Doctor doctor, Patient patient,
                  String dateOfReview, String diagnose, double price) {
        this.id = id;
        this.doctor = doctor;
        this.patient = patient;
        this.dateOfReview = dateOfReview;
        this.diagnose = diagnose;
        this.price = price;
    }

    public Review(Doctor doctor, Patient patient, String dateOfReview,
                  String diagnose, double price) {
        this.doctor = doctor;
        this.patient = patient;
        this.dateOfReview = dateOfReview;
        this.diagnose = diagnose;
        this.price = price;
    }

    public Review(String id, Doctor doctor, Patient patient, String dateOfReview,
                  String diagnose, double price, LocalDateTime createdAt,
                  LocalDateTime updatedAt) {
        this.id = id;
        this.doctor = doctor;
        this.patient = patient;
        this.dateOfReview = dateOfReview;
        this.diagnose = diagnose;
        this.price = price;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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

    public String getDateOfReview() {
        return dateOfReview;
    }

    public void setDateOfReview(String dateOfReview) {
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

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id='" + id + '\'' +
                ", doctor=" + doctor +
                ", patient=" + patient +
                ", dateOfReview=" + dateOfReview +
                ", diagnose='" + diagnose + '\'' +
                ", price=" + price +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }


}