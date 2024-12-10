package org.huhehai.hospital.service;

import org.huhehai.hospital.entity.Register;
import org.huhehai.hospital.mapper.RegisterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private RegisterMapper registerMapper;

    @Override
    public List<Register> getRegisterByPatientName(String patient_Name) {
        return registerMapper.getRegisterByPatientName(patient_Name);
    }

    @Override
    public void addRegister(Register register) {
        registerMapper.addRegister(register);
    }
}