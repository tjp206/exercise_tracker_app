package com.example.exercise_tracker.exercise_tracker_app.models;

public abstract class Exercise {

    private String exerciseType;
    private String exerciseTargetArea;

    public Exercise(String exerciseType, String exerciseTargetArea){
        this.exerciseType = exerciseType;
        this.exerciseTargetArea = exerciseTargetArea;
    }

    public Exercise(){}

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
