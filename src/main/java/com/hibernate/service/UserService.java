package com.hibernate.service;

import com.hibernate.entity.User;
import com.hibernate.vo.request.UserRequestVO;

import java.util.List;

public interface UserService {

    User findById(Long id);
    List<User> findAll();
    User findByName(String name);
    User saveUser(UserRequestVO request);

}
