package dsp.com.clinicproject.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document
public class Doctor {

    @Id
    private String id;
    private String name;
    private String speciality;
    private String category;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Doctor() {
    }

    public Doctor(String id, String name, String speciality,
                  String category, LocalDateTime createdAt,
                  LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.speciality = speciality;
        this.category = category;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Doctor(String name, String speciality, String category) {
        this.name = name;
        this.speciality = speciality;
        this.category = category;
    }

    public Doctor(String id,String name, String speciality, String category) {
        this.id = id;
        this.name = name;
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
