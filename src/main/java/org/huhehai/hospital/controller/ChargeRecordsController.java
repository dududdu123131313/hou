package org.huhehai.hospital.controller;

import org.huhehai.hospital.entity.ChargeRecords;
import org.huhehai.hospital.service.ChargeRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chargeRecords")
public class ChargeRecordsController {

    @Autowired
    private ChargeRecordsService chargeRecordsService;

    // 根据用户名查询该用户的所有挂号记录
    @GetMapping("/user/{username}")
    public ResponseEntity<List<ChargeRecords>> getChargeRecordsByUsername(@PathVariable String username) {
        List<ChargeRecords> chargeRecords = chargeRecordsService.getChargeRecordsByUsername(username);
        return new ResponseEntity<>(chargeRecords, HttpStatus.OK);
    }

    // 新增挂号记录信息
    @PostMapping("")
    public ResponseEntity<Void> addChargeRecord(@RequestBody ChargeRecords chargeRecords) {
        chargeRecordsService.addChargeRecord(chargeRecords);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}