package org.huhehai.hospital.service;

import org.huhehai.hospital.entity.Identification;
import org.huhehai.hospital.mapper.IdentificationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdentificationServiceImpl implements IdentificationService {

    @Autowired
    private IdentificationMapper identificationMapper;

    @Override
    public Identification getIdentificationByUserName(String user_name) {
        return identificationMapper.getIdentificationByUserName(user_name);
    }

    @Override
    public List<Identification> getAllIdentifications() {
        return identificationMapper.getAllIdentifications();
    }

    @Override
    public Identification insertIdentification(Identification identification) {
        int result = identificationMapper.insertIdentification(identification);
        if (result > 0) {
            return identification;
        }
        return null;
    }
}