package dio.budgeting.infrastructure.http.request;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import dio.budgeting.application.input.CalculateTotalSpentInput;
import dio.budgeting.domain.Category;

public record CalculationFilterRequest(
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate,
        Category category) {

    public CalculateTotalSpentInput toInput() {
        return new CalculateTotalSpentInput(startDate(), endDate(), category());
    }
}
