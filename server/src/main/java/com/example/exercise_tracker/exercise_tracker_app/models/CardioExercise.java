package com.example.exercise_tracker.exercise_tracker_app.models;

import javax.persistence.*;

@Entity
@Table(name = "cardio_exercises")
public class CardioExercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String exerciseDescription;
    private int minutes;
    private int distance;

    @ManyToOne
    @JoinColumn(name="workout_id", nullable = false)
    private Workout workout;

    public CardioExercise(String exerciseDescription, int minutes, int distance, Workout workout) {
        this.exerciseDescription = exerciseDescription;
        this.minutes = minutes;
        this.distance = distance;
        this.workout= workout;
    }

    public CardioExercise(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }

    public String getExerciseDescription() {
        return exerciseDescription;
    }

    public void setExerciseDescription(String exerciseDescription) {
        this.exerciseDescription = exerciseDescription;
    }
}
