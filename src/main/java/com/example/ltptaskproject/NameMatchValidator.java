package com.example.ltptaskproject;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.BeanWrapperImpl;

import java.util.Objects;

public class NameMatchValidator implements ConstraintValidator<NameMatch, Object> {

    @Override
    public void initialize(NameMatch annotation) {
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if (value == null) {
            return true; // Если объект null, то ничего не проверяем
        }

        BeanWrapperImpl beanWrapper = new BeanWrapperImpl(value);
        String firstName = (String) beanWrapper.getPropertyValue("firstName");
        String lastName = (String) beanWrapper.getPropertyValue("lastName");

        if (firstName == "" && lastName == "") {
            return true;
        }

        return !Objects.equals(firstName, lastName);
    }
}
