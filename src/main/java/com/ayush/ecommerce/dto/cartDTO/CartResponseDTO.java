package com.ayush.ecommerce.dto.cartDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartResponseDTO {

    private Long cartId;
    private Long userId;
    private BigDecimal totalPrice;
    private List<CartItemResponseDTO> items;
}

