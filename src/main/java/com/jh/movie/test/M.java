package com.jh.movie.test;

public class M {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("我被回收了");
    }
}
