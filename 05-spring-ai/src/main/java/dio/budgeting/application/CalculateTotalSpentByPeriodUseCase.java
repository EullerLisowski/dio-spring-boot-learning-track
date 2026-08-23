package dio.budgeting.application;

import java.time.LocalTime;
import java.time.ZoneOffset;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import dio.budgeting.application.input.CalculateTotalSpentInput;
import dio.budgeting.application.output.TotalSpentByCategory;
import dio.budgeting.domain.TransactionRepository;

@Service
public class CalculateTotalSpentByPeriodUseCase {

    private final TransactionRepository transactionRepository;

    public CalculateTotalSpentByPeriodUseCase(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Tool(name = "calculate-total-spent", description = "Calcula o total gasto em um dado período de tempo")
    public TotalSpentByCategory execute(CalculateTotalSpentInput input) {

        return new TotalSpentByCategory(input.category(),
                this.transactionRepository.sumAmountByCategoryAndCreatedOnBetween(
                        input.category(),
                        input.start().atStartOfDay().toInstant(ZoneOffset.UTC),
                        input.end().atTime(LocalTime.MAX).toInstant(ZoneOffset.UTC)));
    }

}
