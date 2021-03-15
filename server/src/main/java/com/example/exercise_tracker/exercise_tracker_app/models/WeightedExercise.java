package com.example.exercise_tracker.exercise_tracker_app.models;

import javax.persistence.*;

@Entity
@Table(name="weighted_exercises")
public class WeightedExercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String exerciseType;
    private String exerciseTargetArea;
    private int sets;
    private int reps;
    private double weight;

    @ManyToOne
    @JoinColumn(name="workout_id", nullable = false)
    private Workout workout;

    public WeightedExercise(String exerciseType, String exerciseTargetArea, int sets, int reps, double weight, Workout workout) {
        this.exerciseType = exerciseType;
        this.exerciseTargetArea = exerciseTargetArea;
        this.sets = sets;
        this.reps = reps;
        this.weight = weight;
        this.workout = workout;
    }

    public WeightedExercise(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }

    public String getExerciseType() {
        return exerciseType;
    }

    public void setExerciseType(String exerciseType) {
        this.exerciseType = exerciseType;
    }

    public String getExerciseTargetArea() {
        return exerciseTargetArea;
    }

    public void setExerciseTargetArea(String exerciseTargetArea) {
        this.exerciseTargetArea = exerciseTargetArea;
    }
}

