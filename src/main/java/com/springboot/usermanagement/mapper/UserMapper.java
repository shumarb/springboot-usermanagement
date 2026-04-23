package com.springboot.usermanagement.mapper;

import com.springboot.usermanagement.dto.UserDto;
import com.springboot.usermanagement.entity.User;
import org.springframework.stereotype.Component;

// @Component makes Spring create a Spring Bean for this class.
@Component
public class UserMapper {

    // Convert User entity to User DTO
    public UserDto toDto(User user) {
        return new UserDto(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail());
    }

    // Convert User DTO to User Entity
    public User toEntity(UserDto userDto) {
        return new User(userDto.id(), userDto.firstName(), userDto.lastName(), userDto.email());
    }
}
