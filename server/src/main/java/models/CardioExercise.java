package models;

public class CardioExercise extends Exercise {

    private Long id;
    private int minutes;
    private int distance;

    public CardioExercise(String exerciseType, String exerciseTargetArea, int minutes, int distance) {
        super(exerciseType, exerciseTargetArea);
        this.minutes = minutes;
        this.distance = distance;
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
}
