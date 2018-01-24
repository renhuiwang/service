package com.huawei.bmi.controller;

import org.springframework.stereotype.Component;


@Component
public class BmiDelegate implements Bmi {

    public String helloworld(String name){

        // Do Some Magic Here!
        return name;
    }
}
