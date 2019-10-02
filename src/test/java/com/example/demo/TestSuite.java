package com.example.demo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.example.demo.controllers.CartControllerTest;
import com.example.demo.controllers.OrderControllerTest;
import com.example.demo.controllers.UserControllerTest;

@RunWith(Suite.class)
@SuiteClasses({CartControllerTest.class, OrderControllerTest.class, UserControllerTest.class})
public class TestSuite {

}
