package com.example.exercise_tracker.exercise_tracker_app.components;

import com.example.exercise_tracker.exercise_tracker_app.models.Workout;
import com.example.exercise_tracker.exercise_tracker_app.repositories.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.time.LocalTime;

@Component

public class DataLoader implements ApplicationRunner {

    @Autowired
    WorkoutRepository workoutRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        Workout workout1 = new Workout(LocalDate.now(), LocalTime.now(), LocalTime.now());
        workoutRepository.save(workout1);
    }
}
