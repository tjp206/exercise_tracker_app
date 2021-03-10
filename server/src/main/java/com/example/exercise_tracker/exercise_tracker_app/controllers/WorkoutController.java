package com.example.exercise_tracker.exercise_tracker_app.controllers;

import com.example.exercise_tracker.exercise_tracker_app.models.Workout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.exercise_tracker.exercise_tracker_app.repositories.WorkoutRepository;

import java.util.List;

@RestController
public class WorkoutController {

    @Autowired
    WorkoutRepository workoutRepository;

    @GetMapping(value = "/workouts")
    public ResponseEntity<List<Workout>> getAllWorkouts() {
        return new ResponseEntity<>(workoutRepository.findAll(), HttpStatus.OK);
    }
}
