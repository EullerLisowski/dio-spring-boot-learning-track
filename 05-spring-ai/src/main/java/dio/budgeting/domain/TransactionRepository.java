package dio.budgeting.domain;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

public interface TransactionRepository {
    Transaction save(Transaction transaction);

    List<Transaction> findAllByCategory(Category category);

    BigDecimal sumAmountByCategoryAndCreatedOnBetween(Category category, Instant startDate, Instant endDate);
}
