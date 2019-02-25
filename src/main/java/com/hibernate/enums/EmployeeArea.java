package com.hibernate.enums;

public enum EmployeeArea {

    IT("Information Technology"),
    FINANCES("Finances"),
    HR("Human Resources");

    EmployeeArea(String name) {

    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
