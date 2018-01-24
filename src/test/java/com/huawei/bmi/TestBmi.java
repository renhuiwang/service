package com.huawei.bmi.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestBmi {

    BmiDelegate bmiDelegate = new BmiDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "renhui"; // You should put the expect String type value here.

        String returnValue = bmiDelegate.helloworld("renhui");

        assertEquals(expactReturnValue, returnValue);
    }

}
