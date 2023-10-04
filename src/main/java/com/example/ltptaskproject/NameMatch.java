package com.example.ltptaskproject;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NameMatchValidator.class)
public @interface NameMatch {
    String message() default "First name and Last name are the same";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
