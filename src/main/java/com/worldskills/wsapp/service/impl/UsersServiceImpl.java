package com.worldskills.wsapp.service.impl;

import com.worldskills.wsapp.entity.Users;
import com.worldskills.wsapp.repository.UsersRepository;
import com.worldskills.wsapp.service.UsersService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    private final UsersRepository usersRepository;

    public UsersServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public List<Users> getUserss() {
        return usersRepository.findAll();
    }

    @Override
    public Users getUsersById(Long id) {
        return usersRepository.findById(id).orElse(null);
    }

    @Override
    public Users getUsersByLoginAndPassword(String login, String password) {
        return usersRepository.findDistinctByLoginAndPassword(login,password);
    }

    @Override
    public void deleteUsers(Long id) {
        usersRepository.deleteById(id);
    }
    @Transactional
    @Override
    public void saveUsers(Users user) {
        usersRepository.save(user);
    }
}
