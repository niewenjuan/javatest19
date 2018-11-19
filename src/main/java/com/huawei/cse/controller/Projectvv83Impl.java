package com.huawei.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-11-19T14:24:57.589Z")

@RestSchema(schemaId = "projectvv83")
@RequestMapping(path = "/cse", produces = MediaType.APPLICATION_JSON)
public class Projectvv83Impl {

    @Autowired
    private Projectvv83Delegate userProjectvv83Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectvv83Delegate.helloworld(name);
    }

}
