package com.clientmanager.clientmanager.service;

import com.clientmanager.clientmanager.model.UserDetails;
import com.clientmanager.clientmanager.validation.UserValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.clientmanager.clientmanager.repository.UserRepository;

import javax.transaction.Transactional;


@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserValidation userValidation ;

    @Autowired
  private   UserRepository userRepository;

    @Override
    public UserDetails saveUserDetails(UserDetails userDetails) {
        userValidation.validator(userDetails);
       return userRepository.save(userDetails);


    }
}