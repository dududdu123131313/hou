package org.huhehai.hospital.service;

import org.huhehai.hospital.entity.RegistrationList;
import java.util.List;

public interface RegistrationListService {
    List<RegistrationList> getRegistrationListByUserName(String name);
    void addRegistrationList(RegistrationList registrationList);

    // 根据账户名查询挂号列表的新方法
    List<RegistrationList> getRegistrationListByAccountName(String accountName);

    void cancelRegistrationById(String ID);
}