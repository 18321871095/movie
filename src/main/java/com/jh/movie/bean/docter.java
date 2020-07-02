package com.jh.movie.bean;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "people",havingValue = "docter")
public class docter implements people {
    @Override
    public void print() {
        System.out.println("我是医生");
    }
}
