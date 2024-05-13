package com.zaurtregulov.spring.rest.exeption_handling;

import sun.security.mscapi.CPublicKey;

public class EmployeeIncorrectData {
    private String info;
    public EmployeeIncorrectData(){

    }

    public String getInfo() {
        return info;
    }
    public void setInfo(String info){
        this.info = info;
    }
}
