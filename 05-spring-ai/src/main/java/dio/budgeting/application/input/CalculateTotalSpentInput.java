package dio.budgeting.application.input;

import java.time.LocalDate;

import dio.budgeting.domain.Category;

public record CalculateTotalSpentInput(LocalDate start, LocalDate end, Category category) {
} 