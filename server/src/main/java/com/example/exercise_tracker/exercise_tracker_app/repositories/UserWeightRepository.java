package com.example.exercise_tracker.exercise_tracker_app.repositories;

import com.example.exercise_tracker.exercise_tracker_app.models.UserWeight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserWeightRepository extends JpaRepository<UserWeight, Long> {
}
