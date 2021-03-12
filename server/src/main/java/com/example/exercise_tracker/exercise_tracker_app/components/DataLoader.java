package com.example.exercise_tracker.exercise_tracker_app.components;

import com.example.exercise_tracker.exercise_tracker_app.models.CardioExercise;
import com.example.exercise_tracker.exercise_tracker_app.models.User;
import com.example.exercise_tracker.exercise_tracker_app.models.WeightedExercise;
import com.example.exercise_tracker.exercise_tracker_app.models.Workout;
import com.example.exercise_tracker.exercise_tracker_app.repositories.CardioExerciseRepository;
import com.example.exercise_tracker.exercise_tracker_app.repositories.UserRepository;
import com.example.exercise_tracker.exercise_tracker_app.repositories.WeightedExerciseRepository;
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

    @Autowired
    UserRepository userRepository;

    @Autowired
    CardioExerciseRepository cardioExerciseRepository;

    @Autowired
    WeightedExerciseRepository weightedExerciseRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        User mark = new User("Mark", "Smith", LocalDate.now(), "male", "mark@gmail.com", 180);
        userRepository.save(mark);

        User stacey = new User("Stacey", "Smith", LocalDate.now(), "female", "stacey@gmail.com", 155);
        userRepository.save(stacey);

        Workout workout1 = new Workout(LocalDate.now(), LocalTime.now(), LocalTime.now(), mark);
        workoutRepository.save(workout1);

        Workout workout2 = new Workout(LocalDate.now(), LocalTime.now(), LocalTime.now(), stacey);
        workoutRepository.save(workout2);

        WeightedExercise weightedExercise1 = new WeightedExercise("Dumbbells", "chest", 4, 12, 30.00, workout1);
        weightedExerciseRepository.save(weightedExercise1);

        CardioExercise cardioExercise1 = new CardioExercise("treadmill", "heart", 60, 10, workout2);
        cardioExerciseRepository.save(cardioExercise1);
    }
}

