package com.huawei.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectvv83 {

        Projectvv83Delegate projectvv83Delegate = new Projectvv83Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectvv83Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}