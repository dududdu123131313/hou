package org.huhehai.hospital.service;

import org.huhehai.hospital.entity.ChargeRecords;
import org.huhehai.hospital.mapper.ChargeRecordsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChargeRecordsServiceImpl implements ChargeRecordsService {

    @Autowired
    private ChargeRecordsMapper chargeRecordsMapper;

    @Override
    public List<ChargeRecords> getChargeRecordsByUsername(String username) {
        return chargeRecordsMapper.getChargeRecordsByUsername(username);
    }

    @Override
    public void addChargeRecord(ChargeRecords chargeRecords) {
        chargeRecordsMapper.addChargeRecords(chargeRecords);
    }
}