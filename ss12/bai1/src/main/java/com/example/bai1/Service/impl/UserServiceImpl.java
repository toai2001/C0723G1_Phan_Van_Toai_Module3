package com.example.bai1.Service.impl;

import com.example.bai1.Repo.IUserRepo;
import com.example.bai1.Repo.impl.UserRepoImpl;
import com.example.bai1.Service.IUserService;
import com.example.bai1.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements IUserService {
    private IUserRepo userRepo = new UserRepoImpl();
    @Override
    public void insertUser(User user) throws SQLException {
        userRepo.insertUser(user);
    }

    @Override
    public User selectUser(int id) {
        return userRepo.selectUser(id);
    }

    @Override
    public List<User> selectAllUsers() {
        return userRepo.selectAllUsers();
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return userRepo.deleteUser(id);
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        return userRepo.updateUser(user);
    }

    @Override
    public List<User> searchByCountry(String country) {
        return userRepo.searchByCountry(country);
    }

    @Override
    public List<User> sortByName() {
        return userRepo.sortByName();
    }
}
