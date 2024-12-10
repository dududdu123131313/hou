package org.huhehai.hospital.service;

import org.huhehai.hospital.entity.Charge;
import org.huhehai.hospital.mapper.ChargeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChargeServiceImpl implements ChargeService {

    @Autowired
    private ChargeMapper chargeMapper;

    @Override
    public Charge getChargeByDoctorName(String doctorName) {
        return chargeMapper.getChargeByDoctorName(doctorName);
    }

    @Override
    public List<Charge> getAllCharges() {
        return chargeMapper.getAllCharges();
    }
}