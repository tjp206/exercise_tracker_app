package com.example.exercise_tracker.exercise_tracker_app.components;

import com.example.exercise_tracker.exercise_tracker_app.models.*;
import com.example.exercise_tracker.exercise_tracker_app.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

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

        User Mark = new User("Mark", "Smith", LocalDate.of(1990, Month.JANUARY, 8), "male", "mark@gmail.com", "password123", 185);
        userRepository.save(Mark);

        User Stacey = new User("Stacey", "Smith", LocalDate.of(1995, 2, 12), "female", "stacey@gmail.com", "password321", 155);
        userRepository.save(Stacey);

        UserWeight mark_weight = new UserWeight(92.5, LocalDate.of(2021, 3, 10), Mark);
        userWeightRepository.save(mark_weight);

        UserWeight stacey_weight = new UserWeight(62.5, LocalDate.of(2021, 3, 13), Stacey);
        userWeightRepository.save(stacey_weight);

        Workout workout1 = new Workout(LocalDate.of(2021, 3, 16), LocalTime.of(12, 30), LocalTime.of(13, 35), Mark);
        workoutRepository.save(workout1);

        Workout workout2 = new Workout(LocalDate.of(2021, 3, 15), LocalTime.of(10, 24), LocalTime.of(11,47), Stacey);
        workoutRepository.save(workout2);

        WeightedExercise we1 = new WeightedExercise("Squats", "Legs", 4, 15, 65.50, workout1);
        weightedExerciseRepository.save(we1);

        CardioExercise ce1 = new CardioExercise("Speed Bike",  60, 10, workout2);
        cardioExerciseRepository.save(ce1);
    }
}