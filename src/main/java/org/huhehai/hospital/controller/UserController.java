package org.huhehai.hospital.controller;

import org.huhehai.hospital.entity.User;
import org.huhehai.hospital.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // 根据用户名查询用户信息
    @GetMapping("/{name}")
    public ResponseEntity<User> getUserByName(@PathVariable String name) {
        User user = userService.getUserByName(name);
        if (user!= null) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // 获取所有用户信息（实际场景可能需考虑权限等，这里仅示例）
    @GetMapping("")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    // 新增用户信息（注册功能，接收前端传来的用户信息对象进行注册）
    @PostMapping("/register")
    public ResponseEntity<Void> registerUser(@RequestBody User user) {
        try {
            userService.registerUser(user);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // 用户通过账号名和密码登录接口
    @PostMapping("/login/account")
    public ResponseEntity<User> loginByAccountNameAndPassword(@RequestBody User user) {
        User loggedInUser = userService.loginByAccountNameAndPassword(user.getAccountName(), user.getPassWord());
        if (loggedInUser!= null) {
            return new ResponseEntity<>(loggedInUser, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
    }

    // 用户通过手机号和密码登录接口
    @PostMapping("/login/phone")
    public ResponseEntity<User> loginByPhoneNumberAndPassword(@RequestBody User user) {
        User loggedInUser = userService.loginByPhoneNumberAndPassword(user.getPhoneNumber(), user.getPassWord());
        if (loggedInUser!= null) {
            return new ResponseEntity<>(loggedInUser, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
    }

    // 通过手机号重置密码接口
    @PutMapping("/reset-password")
    public ResponseEntity<Void> resetPassword(@RequestBody User user) {
        userService.resetPassword(user.getPhoneNumber(), user.getPassWord());
        return new ResponseEntity<>(HttpStatus.OK);
    }
}