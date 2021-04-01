package com.example.exercise_tracker.exercise_tracker_app;

import com.example.exercise_tracker.exercise_tracker_app.models.User;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;


public class UserTest {

    User user;

    @Before
    public void before() {
        user = new User("TJ", "Pataria", LocalDate.of(1986, Month.OCTOBER, 1), "male", "tj@gmail.com", "passwordTJ", 183);
    }

    @Test
    public void canGetAge() {
        assertEquals(34, user.getAge(), 0.01);
    }
}
