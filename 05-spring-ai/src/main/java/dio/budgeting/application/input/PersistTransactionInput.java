package dio.budgeting.application.input;

import dio.budgeting.domain.Category;
import lombok.NonNull;

import java.math.BigDecimal;

import org.springframework.ai.tool.annotation.ToolParam;

public record PersistTransactionInput(
        @ToolParam(description = "Descrição do gasto", required = true) @NonNull String description,
        @ToolParam(description = "Valor do gasto em reais (ex: 80.00 para oitenta reais)", required = true) @NonNull BigDecimal amount,
        @ToolParam(description = "Categoria de uma transação", required = true) @NonNull Category category) {
}
