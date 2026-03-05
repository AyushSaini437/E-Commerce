package com.ayush.ecommerce.dto.orderDTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class CreateOrderDTO {

    @NotNull(message = "Cart ID is required")
    @Positive(message = "Cart ID must be greater than 0")
    private Long cartId;

}