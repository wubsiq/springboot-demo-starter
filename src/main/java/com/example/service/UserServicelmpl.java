package com.example.service;

import com.example.entity.User;
import com.example.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServicelmpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id){
        Optional<User> user =userRepository.findById(id);
        return user.orElse(null);
    }

    @Override
    public User saveUser(User user){
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Long id,User userDetails){
        User user = getUserById(id);
        if(user !=null){
            user.setName(userDetails.getName());
            user.setEmail(userDetails.getEmail());
            return userRepository.save(user);
        }
        return null;
    }

    @Override
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

}
