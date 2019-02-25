package com.hibernate.service.impl;

import com.hibernate.entity.User;
import com.hibernate.repository.UserRepository;
import com.hibernate.service.UserService;
import com.hibernate.vo.request.UserRequestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public User findById(Long id){
        return userRepository.findById(id).get();
    }

    public List<User> findAll(){
        return (List<User>) userRepository.findAll();
    }

    public User findByName(String name){
        return userRepository.findByName(name);
    }

    public User saveUser(UserRequestVO request){
        User user = new User();
        user.setName(request.getName());
        user.setSurName(request.getSurName());
        return userRepository.save(user);
    }

}
