package dsp.com.clinicproject.form;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PatientForm {



    private String id;
    private String name;
    private String birthDate;

    public PatientForm() {
    }

    public PatientForm(String id, String name, String birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public PatientForm(String name, String birthDate) {
        this.name = name;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
