package models;

public class CardioExercise extends Exercise {

    private int minutes;
    private int distance;

    public CardioExercise(String exerciseType, String exerciseTargetArea, int minutes, int distance) {
        super(exerciseType, exerciseTargetArea);
        this.minutes = minutes;
        this.distance = distance;
    }

    public CardioExercise(){}

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
}
