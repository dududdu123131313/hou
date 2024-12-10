package org.huhehai.hospital.service;
import java.util.Collections;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.huhehai.hospital.entity.Doctor;
import org.huhehai.hospital.mapper.DoctorMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {
    private static final Logger logger = LoggerFactory.getLogger(DoctorServiceImpl.class);

    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public Doctor getDoctorByName(String name) {
        return doctorMapper.getDoctorByName(name);
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctorMapper.getAllDoctors();
    }

    @Override
    public List<Doctor> getDoctorsByDepartment(String department) {
        return doctorMapper.getDoctorsByDepartment(department);
    }

    @Override
    public List<Doctor> getDoctorsByConditions(String department, String outpatientType, String visitTime) {
        if (visitTime!= null &&!visitTime.isEmpty()) {
            try {
                // 将前端传入的只包含年月日的字符串转换为 Date 对象
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date date = sdf.parse(visitTime);
                // 再将 Date 对象格式化为数据库中字段对应的日期时间格式（假设数据库字段是 datetime 类型，这里格式化为 yyyy-MM-dd HH:mm:ss）
                SimpleDateFormat sdfForDb = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                visitTime = sdfForDb.format(date);
            } catch (Exception e) {
                logger.error("日期格式转换出错", e);
                // 可以根据情况选择抛出异常或者返回空列表等处理方式，这里简单返回空列表表示查询失败
                return Collections.emptyList();
            }
        }
        return doctorMapper.getDoctorsByConditions(department, outpatientType, visitTime);
    }

}