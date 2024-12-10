package org.huhehai.hospital.service;

import org.huhehai.hospital.entity.User;
import org.huhehai.hospital.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    // 根据用户名查询用户信息
    @Override
    public User getUserByName(String name) {
        return userMapper.getUserByName(name);
    }

    // 获取所有用户信息
    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    // 注册新用户（通过手机号等信息），添加生成accountName的逻辑后再调用 UserMapper的注册方法
    @Override
    public void registerUser(User user) {
        // 基于固定规则结合手机号生成accountName，这里示例为添加前缀"acc_"，你可以根据实际需求调整规则
        String generatedAccountName = "user_" + user.getPhoneNumber();
        user.setAccountName(generatedAccountName);

        userMapper.registerUserByPhone(user);
    }

    // 用户通过账号名和密码登录（验证账号名和密码是否匹配），调用 UserMapper 的对应方法获取用户信息
    @Override
    public User loginByAccountNameAndPassword(String accountName, String passWord) {
        return userMapper.getUserByAccountNameAndPassword(accountName, passWord);
    }

    // 用户通过手机号和密码登录（验证手机号和密码是否匹配），调用 UserMapper 的对应方法获取用户信息
    @Override
    public User loginByPhoneNumberAndPassword(String phoneNumber, String passWord) {
        return userMapper.getUserByPhoneNumberAndPassword(phoneNumber, passWord);
    }

    // 通过手机号重置密码，调用 UserMapper 的密码重置方法
    @Override
    public void resetPassword(String phoneNumber, String newPassWord) {
        userMapper.resetPassword(phoneNumber, newPassWord);
    }
}