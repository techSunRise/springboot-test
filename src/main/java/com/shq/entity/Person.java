package com.shq.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("Person.properties")
@ConfigurationProperties(prefix = "person")
@Component
public class Person {

    private String name;

    public void sayHello(){
        System.out.println("i am a person , my name is "+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
