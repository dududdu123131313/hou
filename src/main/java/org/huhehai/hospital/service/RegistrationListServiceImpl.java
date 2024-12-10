package org.huhehai.hospital.service;

import jakarta.transaction.Transactional;
import org.huhehai.hospital.entity.RegistrationList;
import org.huhehai.hospital.mapper.RegistrationListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RegistrationListServiceImpl implements RegistrationListService {

    @Autowired
    private RegistrationListMapper registrationListMapper;

    public RegistrationListServiceImpl(RegistrationListMapper registrationListMapper) {
        this.registrationListMapper = registrationListMapper;
    }

    @Override
    public List<RegistrationList> getRegistrationListByUserName(String name) {
        return registrationListMapper.getRegistrationListByUserName(name);
    }

    @Override
    public List<RegistrationList> getRegistrationListByAccountName(String accountName) {
        return registrationListMapper.getRegistrationListByAccountName(accountName);
    }

    @Override
    @Transactional
    public void addRegistrationList(RegistrationList registrationList) {
        //生成ID
        registrationList.setID(UUID.randomUUID().toString());
        // 插入挂号信息
        registrationListMapper.addRegistrationList(registrationList);
        // 更新医生剩余号数
        registrationListMapper.decrementDoctorRemainingNumber(registrationList);
    }

    @Override
    public void cancelRegistrationById(String ID) {
        registrationListMapper.cancelRegistrationById(ID);
    }
}