package mate.academy.springboot.swagger.model.dto;

import java.math.BigDecimal;
import lombok.Setter;

@Setter
public class ProductResponseDto {
    private Long id;
    private String title;
    private BigDecimal price;
}