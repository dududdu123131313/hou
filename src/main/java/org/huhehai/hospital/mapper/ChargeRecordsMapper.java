package org.huhehai.hospital.mapper;

import org.huhehai.hospital.entity.ChargeRecords;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChargeRecordsMapper {
    List<ChargeRecords> getChargeRecordsByUsername(String username);
    void addChargeRecords(ChargeRecords chargeRecords);
}
