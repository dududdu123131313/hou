package org.huhehai.hospital.controller;

import org.huhehai.hospital.entity.Register;
import org.huhehai.hospital.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registers")
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    // 根据患者姓名查询挂号信息
    @GetMapping("/patient/{patient_Name}")
    public ResponseEntity<List<Register>> getRegisterByPatientName(@PathVariable String patient_Name) {
        List<Register> registers = registerService.getRegisterByPatientName(patient_Name);
        return new ResponseEntity<>(registers, HttpStatus.OK);
    }

    // 新增挂号信息
    @PostMapping("")
    public ResponseEntity<Void> addRegister(@RequestBody Register register) {
        registerService.addRegister(register);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}