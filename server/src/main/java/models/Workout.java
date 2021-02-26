package models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Workout {

    private Long id;
    private LocalDate current_Date;
    private LocalDate start_time;
    private LocalDate end_time;
    private ArrayList<Exercise> exercises;

    public Workout(LocalDate current_Date, LocalDate start_time, LocalDate end_time) {
        this.current_Date = current_Date;
        this.start_time = start_time;
        this.end_time = end_time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCurrent_Date() {
        return current_Date;
    }

    public void setCurrent_Date(LocalDate current_Date) {
        this.current_Date = current_Date;
    }

    public LocalDate getStart_time() {
        return start_time;
    }

    public void setStart_time(LocalDate start_time) {
        this.start_time = start_time;
    }

    public LocalDate getEnd_time() {
        return end_time;
    }

    public void setEnd_time(LocalDate end_time) {
        this.end_time = end_time;
    }

    public ArrayList<Exercise> getExercises() {
        return exercises;
    }

    public void addExercises(Exercise exercise) {
        this.exercises.add(exercise);
    }
}
