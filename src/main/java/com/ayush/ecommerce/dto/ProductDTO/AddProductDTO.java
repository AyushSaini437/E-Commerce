package com.ayush.ecommerce.dto.ProductDTO;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class AddProductDTO {

    @NotBlank
    private String name;

    private String description;

    @NotNull
    @PositiveOrZero
    @Digits(integer = 10, fraction = 2)
    private BigDecimal price;

    @NotNull
    @Min(0)
    private Integer stockQuantity;

    @NotNull
    private Boolean active;

    @NotNull
    @Positive
    private Long categoryId;
}
