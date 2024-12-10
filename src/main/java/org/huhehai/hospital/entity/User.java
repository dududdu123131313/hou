package org.huhehai.hospital.entity;
public class User {
    private String accountName;
    private String passWord;
    private String creatTime;
    private String phoneNumber;
    private String name;
    private String id;
    private Integer age;
    private String sex;
    private String verificationCode;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    @Override
    public String toString() {
        return "User{" +
                "accountName='" + accountName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", creatTime='" + creatTime + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", verificationCode='" + verificationCode + '\'' +
                '}';
    }

    public User(String accountName, String passWord, String creatTime, String phoneNumber, String name, String id, Integer age, String sex, String verificationCode) {
        this.accountName = accountName;
        this.passWord = passWord;
        this.creatTime = creatTime;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.id = id;
        this.age = age;
        this.sex = sex;
        this.verificationCode = verificationCode;
    }
}
