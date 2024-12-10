package org.huhehai.hospital.service;

import org.huhehai.hospital.entity.User;
import java.util.List;

public interface UserService {
    // 根据用户名查询用户信息
    User getUserByName(String name);

    // 获取所有用户信息
    List<User> getAllUsers();

    // 注册新用户（通过手机号等信息）
    void registerUser(User user);

    // 用户通过账号名和密码登录（验证账号名和密码是否匹配）
    User loginByAccountNameAndPassword(String accountName, String passWord);

    // 用户通过手机号和密码登录（验证手机号和密码是否匹配）
    User loginByPhoneNumberAndPassword(String phoneNumber, String passWord);

    // 通过手机号重置密码
    void resetPassword(String phoneNumber, String newPassWord);
}