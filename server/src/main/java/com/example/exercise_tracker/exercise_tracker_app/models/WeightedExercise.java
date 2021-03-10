package com.example.exercise_tracker.exercise_tracker_app.models;

public class WeightedExercise extends Exercise {

    private Long id;
    private int sets;
    private int reps;
    private double weight;

    public WeightedExercise(String exerciseType, String exerciseTargetArea, int sets, int reps, double weight) {
        super(exerciseType, exerciseTargetArea);
        this.sets = sets;
        this.reps = reps;
        this.weight = weight;
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
}

