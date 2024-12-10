package org.huhehai.hospital.controller;

import org.huhehai.hospital.entity.RegistrationList;
import org.huhehai.hospital.service.RegistrationListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registrationLists")
public class RegistrationListController {

    @Autowired
    private RegistrationListService registrationListService;

    // 根据用户名查询挂号预约信息
    @GetMapping("/user/{name}")
    public ResponseEntity<List<RegistrationList>> getRegistrationListByUserName(@PathVariable String name) {
        List<RegistrationList> registrationLists = registrationListService.getRegistrationListByUserName(name);
        return new ResponseEntity<>(registrationLists, HttpStatus.OK);
    }

    // 根据账户名查询挂号预约信息的新接口
    @GetMapping("/account/{accountName}")
    public ResponseEntity<List<RegistrationList>> getRegistrationListByAccountName(@PathVariable String accountName) {
        List<RegistrationList> registrationLists = registrationListService.getRegistrationListByAccountName(accountName);
        return new ResponseEntity<>(registrationLists, HttpStatus.OK);
    }

    // 新增挂号预约信息
    @PostMapping("/addRegistration")
    public ResponseEntity<Void> addRegistrationList(@RequestBody RegistrationList registrationList) {
        registrationListService.addRegistrationList(registrationList);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    //取消预约
    @PostMapping("/cancel/{id}")
    public ResponseEntity<String> cancelRegistration(@PathVariable String id) {
        registrationListService.cancelRegistrationById(id);
        return new ResponseEntity<>("Cancel successful", HttpStatus.OK);
    }
}