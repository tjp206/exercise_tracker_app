package models;

import java.time.LocalDate;
import java.util.List;

public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String sex;
    private String email;
    private Integer height;
    private Double bmi;
    private List<UserWeight> userWeight;

    public User(String firstName, String lastName, LocalDate dob, String sex, String email, Integer height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.sex = sex;
        this.email = email;
        this.height = height;
    }

    public User() {}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Double getBmi() {
        return bmi;
    }

    public void setBmi(Double bmi) {
        this.bmi = bmi;
    }
}
