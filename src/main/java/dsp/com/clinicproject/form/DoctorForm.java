package dsp.com.clinicproject.form;

public class DoctorForm {


    private String id;
    private String name;
    private String surname;
    private String speciality;
    private String category;


    public DoctorForm() {
    }

    public DoctorForm(String id, String name, String surname, String speciality, String category) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
        this.category = category;


    }

    public DoctorForm(String name, String surname, String speciality, String category) {
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
        this.category = category;
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

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
