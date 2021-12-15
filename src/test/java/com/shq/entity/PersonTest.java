package com.shq.entity;

import com.shq.Application;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(classes = Application.class)
@ExtendWith(SpringExtension.class)
public class PersonTest {

    @Autowired
    private Person person;

    @Test
    public void sayHelloTest(){
        person.sayHello();
    }
}
