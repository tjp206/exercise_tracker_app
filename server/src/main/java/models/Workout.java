package models;

import java.util.ArrayList;
import java.util.Date;

public class Workout {

    private Long id;
    private Date current_Date;
    private Date start_time;
    private Date end_time;
    private ArrayList<String> exercises;

    public Workout(Date current_Date, Date start_time, Date end_time) {
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

    public Date getCurrent_Date() {
        return current_Date;
    }

    public void setCurrent_Date(Date current_Date) {
        this.current_Date = current_Date;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public ArrayList<String> getExercises() {
        return exercises;
    }

    public void addExercises(String exercise) {
        this.exercises.add(exercise);
    }
}
