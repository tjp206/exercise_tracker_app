package com.example.exercise_tracker.exercise_tracker_app.repositories;

import com.example.exercise_tracker.exercise_tracker_app.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
