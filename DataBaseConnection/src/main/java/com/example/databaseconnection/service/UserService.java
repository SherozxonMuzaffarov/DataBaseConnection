package com.example.databaseconnection.service;

import com.example.databaseconnection.entity.UserModel;
import com.example.databaseconnection.exception.UserModelNotFoundedException;

import java.util.List;

public interface UserService {
    UserModel saveUser(UserModel model);

    UserModel getById(Long id) throws UserModelNotFoundedException;

    List<UserModel> getAllUser();

    UserModel updateUser(Long id, UserModel model);

    void deleteUser(Long id);

}
