package entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "ExerciseTask", schema = "dbo", catalog = "tts-java-database")
public class ExerciseTaskEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private int id;
    @Basic
    @Column(name = "ExerciseID")
    private int exerciseId;
    @Basic
    @Column(name = "TaskID")
    private int taskId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(int exerciseId) {
        this.exerciseId = exerciseId;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExerciseTaskEntity that = (ExerciseTaskEntity) o;
        return id == that.id && exerciseId == that.exerciseId && taskId == that.taskId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, exerciseId, taskId);
    }
}
