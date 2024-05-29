package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.pojo.UserPojo;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public void saveInfo(UserPojo userPojo){
        User user=new User();
        user.setId(userPojo.getId());
        user.setName(userPojo.getName());
        user.setAge(userPojo.getAge());
        user.setEmail(userPojo.getEmail());


        userRepository.save(user);





    }


}
