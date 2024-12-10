package org.huhehai.hospital.service;

import org.huhehai.hospital.entity.Register;
import java.util.List;

public interface RegisterService {
    List<Register> getRegisterByPatientName(String patient_Name);
    void addRegister(Register register);
}