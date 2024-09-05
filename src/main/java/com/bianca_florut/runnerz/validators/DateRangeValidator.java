package com.bianca_florut.runnerz.validators;

import com.bianca_florut.runnerz.run.Run;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class DateRangeValidator implements ConstraintValidator<DateRangeConstraint, Run> {

    @Override
    public void initialize(DateRangeConstraint constraintAnnotation) {

    }

    @Override
    public boolean isValid(Run run, ConstraintValidatorContext context) {
        if (run != null) {
            if (run.startedOn() != null && run.completedOn() != null && !run.completedOn().isAfter(run.startedOn())) {
                return false;
            }
        }
        return true;
    }
}
