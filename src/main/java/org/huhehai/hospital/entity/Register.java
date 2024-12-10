package org.huhehai.hospital.entity;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class Register implements Serializable {
    /*病人姓名*/
    private String patient_Name;
//    病人手机号
    private String patient_Phonenumber;
//    就诊时间
    private Date visitTime;
//    医生姓名
    private String doctor_Name;
//    医生科室
    private String doctor_department;
//    门诊类型
    private String outpatientType;
//    挂号时间
    private Date registrationTime;
//    挂号号码
    private Integer medicalNumber;

    public String getPatient_Name() {
        return patient_Name;
    }

    public void setPatient_Name(String patient_Name) {
        this.patient_Name = patient_Name;
    }

    public String getPatient_Phonenumber() {
        return patient_Phonenumber;
    }

    public void setPatient_Phonenumber(String patient_Phonenumber) {
        this.patient_Phonenumber = patient_Phonenumber;
    }

    public Date getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    public String getDoctor_Name() {
        return doctor_Name;
    }

    public void setDoctor_Name(String doctor_Name) {
        this.doctor_Name = doctor_Name;
    }

    public String getDoctor_department() {
        return doctor_department;
    }

    public void setDoctor_department(String doctor_department) {
        this.doctor_department = doctor_department;
    }

    public String getOutpatientType() {
        return outpatientType;
    }

    public void setOutpatientType(String outpatientType) {
        this.outpatientType = outpatientType;
    }

    public Date getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    public Integer getMedicalNumber() {
        return medicalNumber;
    }

    public void setMedicalNumber(Integer medicalNumber) {
        this.medicalNumber = medicalNumber;
    }

}
