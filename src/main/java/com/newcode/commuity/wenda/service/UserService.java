package com.newcode.commuity.wenda.service;

import com.newcode.commuity.wenda.dao.UserMapper;
import com.newcode.commuity.wenda.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User findUserId(int id){
        return userMapper.selectById(id);
    }
}
