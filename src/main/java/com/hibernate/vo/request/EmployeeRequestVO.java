package com.hibernate.vo.request;

import com.hibernate.enums.EmployeeArea;

public class EmployeeRequestVO {

    private String identification;
    private EmployeeArea employeeArea;
    private UserRequestVO user;

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public EmployeeArea getEmployeeArea() {
        return employeeArea;
    }

    public void setEmployeeArea(EmployeeArea employeeArea) {
        this.employeeArea = employeeArea;
    }

    public UserRequestVO getUser() {
        return user;
    }

    public void setUser(UserRequestVO user) {
        this.user = user;
    }

}
