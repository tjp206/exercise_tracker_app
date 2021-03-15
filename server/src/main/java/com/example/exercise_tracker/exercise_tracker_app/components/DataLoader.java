package com.example.exercise_tracker.exercise_tracker_app.components;

import com.example.exercise_tracker.exercise_tracker_app.models.User;
import com.example.exercise_tracker.exercise_tracker_app.models.UserWeight;
import com.example.exercise_tracker.exercise_tracker_app.models.Workout;
import com.example.exercise_tracker.exercise_tracker_app.repositories.*;
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

    @Autowired
    UserWeightRepository userWeightRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    WeightedExerciseRepository weightedExerciseRepository;

    @Autowired
    CardioExerciseRepository cardioExerciseRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        User Mark = new User("Mark", "Smith", LocalDate.now(), "male", "mark@gmail.com", 185);
        userRepository.save(Mark);

        User Stacey = new User("Stacey", "Smith", LocalDate.now(), "female", "stacey@gmail.com", 155);
        userRepository.save(Stacey);

        UserWeight mark_weight = new UserWeight(92.5, LocalDate.now(), Mark);
        userWeightRepository.save(mark_weight);

        UserWeight stacey_weight = new UserWeight(62.5, LocalDate.now(), Stacey);
        userWeightRepository.save(stacey_weight);

        Workout workout1 = new Workout(LocalDate.now(), LocalTime.now(), LocalTime.now(), Mark);
        workoutRepository.save(workout1);

        Workout workout2 = new Workout(LocalDate.now(), LocalTime.now(), LocalTime.now(), Stacey);
        workoutRepository.save(workout2);
    }
}