package com.example.exercise_tracker.exercise_tracker_app.controllers;


import com.example.exercise_tracker.exercise_tracker_app.models.User;
import com.example.exercise_tracker.exercise_tracker_app.models.WeightedExercise;
import com.example.exercise_tracker.exercise_tracker_app.repositories.WeightedExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WeightedExerciseController {

    @Autowired
    WeightedExerciseRepository weightedExerciseRepository;

    @GetMapping(value = "/weighted-exercises")
    public ResponseEntity<List<WeightedExercise>> getAllWeightedExercises() {
        return new ResponseEntity<>(weightedExerciseRepository.findAll(), HttpStatus.OK);
    }
}
