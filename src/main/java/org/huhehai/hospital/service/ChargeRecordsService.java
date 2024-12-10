package org.huhehai.hospital.service;

import org.huhehai.hospital.entity.ChargeRecords;
import java.util.List;

public interface ChargeRecordsService {
    List<ChargeRecords> getChargeRecordsByUsername(String username);
    void addChargeRecord(ChargeRecords chargeRecords);
}