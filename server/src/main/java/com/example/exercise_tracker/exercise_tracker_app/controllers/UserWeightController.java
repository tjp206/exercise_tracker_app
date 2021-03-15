package com.example.exercise_tracker.exercise_tracker_app.controllers;

import com.example.exercise_tracker.exercise_tracker_app.models.User;
import com.example.exercise_tracker.exercise_tracker_app.models.UserWeight;
import com.example.exercise_tracker.exercise_tracker_app.repositories.UserWeightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserWeightController {

    @Autowired
    UserWeightRepository userWeightRepository;

    @GetMapping(value = "/user-weights")
    public ResponseEntity<List<UserWeight>> getAllUsers() {
        return new ResponseEntity<>(userWeightRepository.findAll(), HttpStatus.OK);
    }
}
