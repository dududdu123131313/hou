package org.huhehai.hospital.entity;

import java.util.Date;

public class Doctor {
    private String name;
    private String department;
    private String outpatientType;
    private Integer totalNumber;
    private Integer remainingNumbers;
    private Date visitTime;
    private Float cost;

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    // 生成Getter和Setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getOutpatientType() {
        return outpatientType;
    }

    public void setOutpatientType(String outpatientType) {
        this.outpatientType = outpatientType;
    }

    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public Integer getRemainingNumbers() {
        return remainingNumbers;
    }

    public void setRemainingNumbers(Integer remainingNumbers) {
        this.remainingNumbers = remainingNumbers;
    }

    public Date getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }
}
