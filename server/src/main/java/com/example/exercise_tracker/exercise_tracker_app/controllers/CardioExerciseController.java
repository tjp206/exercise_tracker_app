package com.example.exercise_tracker.exercise_tracker_app.controllers;


import com.example.exercise_tracker.exercise_tracker_app.models.CardioExercise;
import com.example.exercise_tracker.exercise_tracker_app.models.User;
import com.example.exercise_tracker.exercise_tracker_app.repositories.CardioExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardioExerciseController {

    @Autowired
    CardioExerciseRepository cardioExerciseRepository;

    @GetMapping(value = "/cardio-exercises")
    public ResponseEntity<List<CardioExercise>> getAllCardioExercises() {
        return new ResponseEntity<>(cardioExerciseRepository.findAll(), HttpStatus.OK);
    }
}
