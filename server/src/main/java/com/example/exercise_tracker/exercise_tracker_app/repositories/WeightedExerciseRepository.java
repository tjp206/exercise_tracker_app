package com.example.exercise_tracker.exercise_tracker_app.repositories;

import com.example.exercise_tracker.exercise_tracker_app.models.WeightedExercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeightedExerciseRepository extends JpaRepository<WeightedExercise, Long> {
}
