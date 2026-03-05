package com.ayush.ecommerce.dto.categoryDTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class AddCategoryDTO {

    @NotBlank(message = "Name is required")
    private String name;

    private String description;

    @Positive
    private Long parentCategoryId;

}
