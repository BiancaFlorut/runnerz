package com.bianca_florut.runnerz.validators;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = DateRangeValidator.class)
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface DateRangeConstraint {
    String message() default "Start date must be before end date";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
