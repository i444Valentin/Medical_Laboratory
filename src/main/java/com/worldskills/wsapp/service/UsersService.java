package com.worldskills.wsapp.service;

import com.worldskills.wsapp.entity.Users;

import java.util.List;

public interface UsersService {
    List<Users> getUserss();

    Users getUsersById(Long id);

    Users getUsersByLoginAndPassword(String login,String password);

    void deleteUsers(Long id);

    void saveUsers(Users user);
}
