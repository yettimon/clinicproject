package dsp.com.clinicproject.form;

import java.time.LocalDateTime;

public class PatientForm {



    private String id;
    private String name;
    private String surname;
    private LocalDateTime birthDate;

    public PatientForm() {
    }

    public PatientForm(String id, String name, String surname, LocalDateTime birthDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public PatientForm(String name, String surname, LocalDateTime birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
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

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }
}
