package com.example.ltptaskproject;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
public class User {
    @NotBlank(message = "First name cannot be blank")
    @Size(min = 2, message = "First name must be at least 2 character length")
    private String firstName;

    @NotBlank(message = "Last name cannot be blank")
    @Size(min = 2, message = "Last name must be at least 2 character length")
    private String lastName;

    @NotBlank(message = "Username cannot be blank")
    @Size(min = 7, message = "Username must be at least 7 character length")
    private String userName;
    @Email(message = "Incorrect email")
    private String email;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Past(message = "Birth date must be earlier")
    private LocalDate dateOfBirth;

    public User() {
    }
}
