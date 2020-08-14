package dsp.com.clinicproject.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Patient {

    private String id;
    private String name;
    private String surname;
    private String birthDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Patient() {
    }



    public Patient(String id, String name, String surname, String birthDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public Patient(String name, String surname, String birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public Patient(String id, String name, String surname, String birthDate,
                   LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
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
}
