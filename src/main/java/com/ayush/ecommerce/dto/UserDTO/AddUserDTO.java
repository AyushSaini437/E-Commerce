package com.ayush.ecommerce.dto.UserDTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AddUserDTO {

    @NotBlank(message = "Field is required")
    @Size(min = 3, max = 20, message = "Name should be 3 to 30 character long")
    private String userName;

    @Email
    @NotBlank(message = "Field is required")
    private String email;

    @NotBlank
    @Size(min = 6, message = "Password should be at least 6 character long")
    private String password;

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "^[0-9]{10}$", message = "Phone number should be 10 digits")
    private String phone;

}
