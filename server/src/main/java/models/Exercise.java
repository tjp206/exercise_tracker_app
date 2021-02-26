package models;

public abstract class Exercise {

    private Long id;
    private String exerciseType;
    private String exerciseTargetArea;

    public Exercise(String exerciseType, String exerciseTargetArea){
        this.exerciseType = exerciseType;
        this.exerciseTargetArea = exerciseTargetArea;
    }

    public Exercise(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
