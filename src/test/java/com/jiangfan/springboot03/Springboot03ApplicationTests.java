package com.jiangfan.springboot03;

import com.jiangfan.springboot03.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot03ApplicationTests {
    @Autowired
    private Person person;
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

    @Test
    public void contextLoads2() {
        System.out.println(applicationContext.containsBean("userService"));
    }

}
