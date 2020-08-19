package dsp.com.clinicproject.form;

import dsp.com.clinicproject.model.Doctor;
import dsp.com.clinicproject.model.Patient;

import java.time.LocalDateTime;
import java.util.Objects;

public class ReviewForm {



        private String id;
        private Doctor doctor;
        private Patient patient;
        private String  dateOfReview;
        private String diagnose;
        private double price;


        public ReviewForm() {
        }

        public ReviewForm(Doctor doctor, Patient patient, String dateOfReview, String diagnose, double price) {
            this.doctor = doctor;
            this.patient = patient;
            this.dateOfReview = dateOfReview;
            this.diagnose = diagnose;
            this.price = price;
        }


        public ReviewForm(String id,
                          Doctor doctor,
                          Patient patient,
                          String dateOfReview,
                          String diagnose,
                          double price) {
            this.id = id;
            this.doctor = doctor;
            this.patient = patient;
            this.dateOfReview = dateOfReview;
            this.diagnose = diagnose;
            this.price = price;
        }


    public ReviewForm(String dateOfReview, String diagnose, double price) {
        this.dateOfReview = dateOfReview;
        this.diagnose = diagnose;
        this.price = price;
    }

    public ReviewForm(String id, Patient patient, Doctor doctor, String diagnose, String dateOfReview) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReviewForm that = (ReviewForm) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "ReviewForm{" +
                "id='" + id + '\'' +
                ", doctor=" + doctor +
                ", patient=" + patient +
                ", dateOfReview=" + dateOfReview +
                ", diagnose='" + diagnose + '\'' +
                ", price=" + price +
                '}';
    }
}


