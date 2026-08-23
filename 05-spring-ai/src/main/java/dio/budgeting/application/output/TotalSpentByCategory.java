package dio.budgeting.application.output;

import java.math.BigDecimal;

import dio.budgeting.domain.Category;

public record TotalSpentByCategory(Category category, BigDecimal total) {
}