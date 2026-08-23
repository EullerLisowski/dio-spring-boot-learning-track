package dio.budgeting.infrastructure.http.request;

import java.math.BigDecimal;
import java.math.RoundingMode;

import dio.budgeting.application.input.PersistTransactionInput;
import dio.budgeting.domain.Category;

public record TransactionRequest(String description, Category category, BigDecimal amount) {

    public TransactionRequest(String description, Category category, BigDecimal amount) {
        this.description = description;
        this.amount = amount.setScale(2, RoundingMode.HALF_UP);
        this.category = category;
    }

    public PersistTransactionInput toInput() {
        return new PersistTransactionInput(description, amount, category);
    }
}
