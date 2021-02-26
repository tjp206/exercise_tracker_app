package models;

import java.time.LocalDate;

public class UserWeight {

    private Long id;
    private double weight;
    private LocalDate date;

    public UserWeight(double weight, LocalDate date) {
        this.weight = weight;
        this.date = date;
    }

    public UserWeight() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

}

