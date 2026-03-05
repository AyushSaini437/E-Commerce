package com.ayush.ecommerce.dto.cartDTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class AddCartDTO {

    @NotNull(message = "Product ID is required")
    @Positive(message = "ID should be greater than 0")
    private Long productId;

    @NotNull(message = "Quantity is required")
    @Positive
    private Integer quantity;
}
