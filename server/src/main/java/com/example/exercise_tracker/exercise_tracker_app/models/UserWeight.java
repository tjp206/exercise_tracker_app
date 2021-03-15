package com.example.exercise_tracker.exercise_tracker_app.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "user_weights")
public class UserWeight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double weight;
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private User user;

    public UserWeight(double weight, LocalDate date, User user) {
        this.weight = weight;
        this.date = date;
        this.user = user;
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

