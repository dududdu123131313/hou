package org.huhehai.hospital.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.huhehai.hospital.entity.RegistrationList;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationListMapper {
    List<RegistrationList> getRegistrationListByUserName(String name);
    void addRegistrationList(RegistrationList registrationList);
    // 根据账户名查询挂号预约信息的新方法
    List<RegistrationList> getRegistrationListByAccountName(String accountName);

    void decrementDoctorRemainingNumber(RegistrationList registrationList);
    void cancelRegistrationById(@Param("id") String id);
}