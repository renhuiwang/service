package com.service.service.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestService {

    ServiceDelegate serviceDelegate = new ServiceDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "renhui"; // You should put the expect String type value here.

        String returnValue = serviceDelegate.helloworld("renhui");

        assertEquals(expactReturnValue, returnValue);
    }

}
