package org.huhehai.hospital.entity;

import java.util.Date;

public class ChargeRecords {
    private String username;
    private String user_phoneNumber;
    private Integer user_age;
    private Date visittime;
    private String doctor_department;
    private String doctor_name;
    private String outpatientType;
    private Date registrationTime;
    private Integer medicalNumber;
    private Boolean reservationConfirmation;
    private float chargecost;
    private Date paymentTime;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUser_phoneNumber() {
        return user_phoneNumber;
    }

    public void setUser_phoneNumber(String user_phoneNumber) {
        this.user_phoneNumber = user_phoneNumber;
    }

    public Integer getUser_age() {
        return user_age;
    }

    public void setUser_age(Integer user_age) {
        this.user_age = user_age;
    }

    public Date getVisittime() {
        return visittime;
    }

    public void setVisittime(Date visittime) {
        this.visittime = visittime;
    }

    public String getDoctor_department() {
        return doctor_department;
    }

    public void setDoctor_department(String doctor_department) {
        this.doctor_department = doctor_department;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
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

    public Boolean getReservationConfirmation() {
        return reservationConfirmation;
    }

    public void setReservationConfirmation(Boolean reservationConfirmation) {
        this.reservationConfirmation = reservationConfirmation;
    }

    public float getChargecost() {
        return chargecost;
    }

    public void setChargecost(float chargecost) {
        this.chargecost = chargecost;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }
}
