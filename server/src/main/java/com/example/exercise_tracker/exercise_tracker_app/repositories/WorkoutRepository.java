package com.example.exercise_tracker.exercise_tracker_app.repositories;

import com.example.exercise_tracker.exercise_tracker_app.models.Workout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkoutRepository extends JpaRepository<Workout, Long> {

}
