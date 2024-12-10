package org.huhehai.hospital.controller;

import org.huhehai.hospital.entity.Doctor;
import org.huhehai.hospital.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.huhehai.hospital.entity.Charge;
import org.huhehai.hospital.service.ChargeService;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;
    @Autowired
    private ChargeService chargeService;

    // 根据医生姓名获取医生信息（完善后包含挂号费等信息）
    @GetMapping("/{name}")
    public ResponseEntity<Doctor> getDoctorByName(@PathVariable String name) {
        try {
            Doctor doctor = doctorService.getDoctorByName(name);
            if (doctor!= null) {
                // 获取该医生对应的挂号费信息
                Charge charge = chargeService.getChargeByDoctorName(name);
                if (charge!= null) {
                    doctor.setCost(charge.getCost());
                }
                return new ResponseEntity<>(doctor, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // 获取所有医生信息（同样完善包含挂号费等）
    @GetMapping("")
    public ResponseEntity<List<Doctor>> getAllDoctors() {
        try {
            List<Doctor> doctors = doctorService.getAllDoctors();
            for (Doctor doctor : doctors) {
                Charge charge = chargeService.getChargeByDoctorName(doctor.getName());
                if (charge!= null) {
                    doctor.setCost(charge.getCost());
                }
            }
            return new ResponseEntity<>(doctors, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // 根据科室获取医生信息（完善后添加挂号费信息）
    @GetMapping("/department/{department}")
    public ResponseEntity<List<Doctor>> getDoctorsByDepartment(@PathVariable String department) {
        try {
            List<Doctor> doctors = doctorService.getDoctorsByDepartment(department);
            for (Doctor doctor : doctors) {
                Charge charge = chargeService.getChargeByDoctorName(doctor.getName());
                if (charge!= null) {
                    doctor.setCost(charge.getCost());
                }
            }
            return new ResponseEntity<>(doctors, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/query")
    public ResponseEntity<List<Doctor>> getDoctorsByConditions(
            @RequestParam(required = false) String department,
            @RequestParam(required = false) String outpatientType,  // 修改此处参数名
            @RequestParam(required = false) String visitTime) {    // 修改此处参数名
        List<Doctor> doctors = doctorService.getDoctorsByConditions(department, outpatientType, visitTime);
        for (Doctor doc : doctors) {
            Charge charge = chargeService.getChargeByDoctorName(doc.getName());
            if (charge!= null) {
                doc.setCost(charge.getCost());
            }
        }
        return new ResponseEntity<>(doctors, HttpStatus.OK);
    }
}