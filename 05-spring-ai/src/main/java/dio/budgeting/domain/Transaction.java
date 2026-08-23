package dio.budgeting.domain;

import java.math.BigDecimal;
import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Transaction {
    private TransactionId id;
    private String description;
    private BigDecimal amount;
    private Category category;
    private Instant createdOn;

    public Transaction(String description, BigDecimal amount, Category category) {
        this.id = new TransactionId();
        this.description = description;
        this.amount = amount;
        this.category = category;
        this.createdOn = Instant.now();
    }
}
