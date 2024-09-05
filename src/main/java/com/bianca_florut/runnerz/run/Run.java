package com.bianca_florut.runnerz.run;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;

import static com.bianca_florut.runnerz.Application.logger;

public record Run(
        Integer id,
        @NotEmpty
        String title,
        LocalDateTime startedOn,
        LocalDateTime completedOn,
        @Positive
        Integer kilometers,
        Location location
) {

    public Run {
        if (startedOn() != null && completedOn() != null && !completedOn().isAfter(startedOn())) {
            throw new IllegalArgumentException("startedOn must be before completedOn");
        }
    }
}
