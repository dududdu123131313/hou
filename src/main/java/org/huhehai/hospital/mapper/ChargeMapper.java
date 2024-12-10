package org.huhehai.hospital.mapper;

import org.huhehai.hospital.entity.Charge;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChargeMapper {
    Charge getChargeByDoctorName(String doctorName);
    List<Charge> getAllCharges();
}