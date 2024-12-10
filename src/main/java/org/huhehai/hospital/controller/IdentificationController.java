package org.huhehai.hospital.controller;

import org.huhehai.hospital.entity.Identification;
import org.huhehai.hospital.service.IdentificationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/identifications")
public class IdentificationController {
    private final IdentificationService identificationService;

    public IdentificationController(IdentificationService identificationService) {
        this.identificationService = identificationService;
    }

    // 根据用户名查询对应的身份信息的接口
    @GetMapping("/{user_name}")
    public ResponseEntity<Identification> getIdentificationByUserName(@PathVariable("user_name") String user_name) {
        Identification identification = identificationService.getIdentificationByUserName(user_name);
        if (identification!= null) {
            return new ResponseEntity<>(identification, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // 获取所有身份信息的接口（实际可能较少这样用，仅示例）
    @GetMapping
    public ResponseEntity<List<Identification>> getAllIdentifications() {
        List<Identification> identifications = identificationService.getAllIdentifications();
        if (identifications!= null &&!identifications.isEmpty()) {
            return new ResponseEntity<>(identifications, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}