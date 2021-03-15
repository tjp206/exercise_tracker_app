package com.example.exercise_tracker.exercise_tracker_app.repositories;

import com.example.exercise_tracker.exercise_tracker_app.models.CardioExercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardioExerciseRepository extends JpaRepository<CardioExercise, Long> {
}
