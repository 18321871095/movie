package com.jh.movie.bean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "people",havingValue = "custom",matchIfMissing = true)
public class custom implements  people {
    @Override
    public void print() {
        System.out.println("我是顾客");
    }
}
