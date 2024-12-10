package org.huhehai.hospital.mapper;

import org.huhehai.hospital.entity.Doctor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorMapper {
    Doctor getDoctorByName(String name);
    List<Doctor> getAllDoctors();
    List<Doctor> getDoctorsByDepartment(String department);
    // 新增根据多个条件查询医生信息的方法签名
    List<Doctor> getDoctorsByConditions(String department, String outpatientType, String visitTime);
}