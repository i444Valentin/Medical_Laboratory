package com.worldskills.wsapp.repository;

import com.worldskills.wsapp.entity.User;
import com.worldskills.wsapp.entity.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsersRepository extends CrudRepository<Users, Long> {
    List<Users> findAll();
    Users findDistinctByLoginAndPassword(String logins, String passwords);
}

