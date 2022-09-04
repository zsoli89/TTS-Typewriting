package entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Task", schema = "dbo", catalog = "tts-java-database")
public class TaskEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private int id;
    @Basic
    @Column(name = "TextToType")
    private String textToType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTextToType() {
        return textToType;
    }

    public void setTextToType(String textToType) {
        this.textToType = textToType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskEntity that = (TaskEntity) o;
        return id == that.id && Objects.equals(textToType, that.textToType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, textToType);
    }
}
