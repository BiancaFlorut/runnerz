package com.bianca_florut.runnerz.run;

import com.bianca_florut.runnerz.validators.DateRangeConstraint;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;

import static com.bianca_florut.runnerz.Application.logger;
@DateRangeConstraint
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

}
