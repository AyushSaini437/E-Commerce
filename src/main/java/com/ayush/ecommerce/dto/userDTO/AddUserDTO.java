package com.ayush.ecommerce.dto.userDTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AddUserDTO {

    @NotBlank(message = "Field is required")
    @Size(min = 3, max = 20, message = "Name should be 3 to 30 character long")
    private String user_name;

    @Email
    @NotBlank(message = "Field is required")
    private String email;

}
