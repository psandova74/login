package com.bidbay.service;

import com.bidbay.dto.UserDto;
import com.bidbay.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}