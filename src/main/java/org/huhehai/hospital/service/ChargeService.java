package org.huhehai.hospital.service;

import org.huhehai.hospital.entity.Charge;
import java.util.List;

public interface ChargeService {
    Charge getChargeByDoctorName(String doctorName);
    List<Charge> getAllCharges();
}