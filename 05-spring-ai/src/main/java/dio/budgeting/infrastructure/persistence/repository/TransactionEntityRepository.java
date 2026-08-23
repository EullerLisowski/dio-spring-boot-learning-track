package dio.budgeting.infrastructure.persistence.repository;

import dio.budgeting.domain.Category;
import dio.budgeting.infrastructure.persistence.entity.TransactionEntity;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

public interface TransactionEntityRepository extends CrudRepository<TransactionEntity, UUID> {
    List<TransactionEntity> findAllByCategory(Category category);

    @Query("SELECT SUM(t.amount) FROM TransactionEntity t WHERE t.category = :category AND t.createdOn BETWEEN :startDate AND :endDate")
    BigDecimal sumAmountByCategoryAndCreatedOnBetween(
            @Param("category") Category category,
            @Param("startDate") Instant starDate,
            @Param("endDate") Instant endDate);
}
