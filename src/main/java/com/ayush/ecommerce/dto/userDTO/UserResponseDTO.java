package com.ayush.ecommerce.dto.userDTO;

import com.ayush.ecommerce.entity.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Reduce Boilerplate code and auto generates getters, setters(for non-final fields only), toString, equals(), hashcode(), and Required Arguments Constructor
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDTO {
    private Long id;
    private String user_name;
    private String email;
    private UserRole role;
    private boolean isActive;
}
