package com.example.databaseconnection.service;

import com.example.databaseconnection.entity.UserModel;
import com.example.databaseconnection.exception.UserModelNotFoundedException;
import com.example.databaseconnection.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.Objects;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public UserModel saveUser(UserModel model) {
        return userRepository.save(model);
    }

    @Override
    public UserModel getById(Long id) throws UserModelNotFoundedException {
//        return userRepository.findById(id).get();

        // with exception handler
        Optional<UserModel> model = userRepository.findById(id);
        if (!model.isPresent() ) {
            throw new UserModelNotFoundedException("User not found with this ID :(");
        }
        return model.get();
    }

    @Override
    public List<UserModel> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public UserModel updateUser(Long id, UserModel model) {
       UserModel updatedUser = userRepository.findById(id).get();

           if (Objects.nonNull(updatedUser.getFirstName()) && !" ".equalsIgnoreCase(updatedUser.getFirstName())) {
               updatedUser.setFirstName(model.getFirstName());
           }
           if (Objects.nonNull(model.getLastName()) && !" ".equalsIgnoreCase(model.getLastName())) {
               updatedUser.setFirstName(model.getLastName());
           }
           if (Objects.nonNull(model.getEmail()) && !" ".equalsIgnoreCase(model.getEmail())) {
               updatedUser.setFirstName(model.getEmail());
           }
           return userRepository.save(updatedUser);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

}
