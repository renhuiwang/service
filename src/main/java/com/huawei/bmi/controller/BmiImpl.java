package com.huawei.bmi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.pojo.RpcSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoDemoCodegen", date = "2018-01-24T03:08:18.915Z")

@RpcSchema(schemaId = "bmi")
public class BmiImpl implements Bmi{

    @Autowired
    private BmiDelegate bmiDelegate;


    public String helloworld(String name) {

        return bmiDelegate.helloworld(name);
    }

}
