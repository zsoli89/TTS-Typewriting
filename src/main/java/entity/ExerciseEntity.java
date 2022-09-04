package entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Exercise", schema = "dbo", catalog = "tts-java-database")
public class ExerciseEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private int id;
    @Basic
    @Column(name = "Ordinal")
    private int ordinal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(int ordinal) {
        this.ordinal = ordinal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExerciseEntity that = (ExerciseEntity) o;
        return id == that.id && ordinal == that.ordinal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ordinal);
    }
}
