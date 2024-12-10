package org.huhehai.hospital.mapper;

import org.huhehai.hospital.entity.Register;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegisterMapper {
    List<Register> getRegisterByPatientName(String patient_Name);
    void addRegister(Register register);
}