package org.huhehai.hospital.service;

import org.huhehai.hospital.entity.Doctor;
import java.util.List;
import org.huhehai.hospital.entity.Doctor;
import java.util.List;

public interface DoctorService {
    Doctor getDoctorByName(String name);
    List<Doctor> getAllDoctors();
    List<Doctor> getDoctorsByDepartment(String department);
    // 修改此处方法参数名，保持与控制器层一致
    List<Doctor> getDoctorsByConditions(String department, String outpatientType, String visitTime);
}