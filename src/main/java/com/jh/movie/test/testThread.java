package com.jh.movie.test;

import java.io.*;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.*;

public class testThread  {


    public static void main(String[] args) throws Exception {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();

        new Thread(new Runnable() {
            @Override
            public void run() {
                read(readLock);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run()
            {
                read1(readLock);
            }
        }).start();
        Thread.sleep(1000);
        new Thread(new Runnable() {
            @Override
            public void run()
            {
                write(writeLock);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run()
            {
                read(readLock);
            }
        }).start();

    }
    public static void read(ReentrantReadWriteLock.ReadLock readLock)  {
        try{
            readLock.lock();
            System.out.println(Thread.currentThread().getName()+"读取文件中");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+"读取完成");
        }catch (Exception e){

        }finally {
            readLock.unlock();
        }
    }
    public static void read1(ReentrantReadWriteLock.ReadLock readLock)  {
        try{
            readLock.lock();
            System.out.println(Thread.currentThread().getName()+"读取文件中");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()+"读取完成");
        }catch (Exception e){

        }finally {
            readLock.unlock();
        }
    }
    public static void write(ReentrantReadWriteLock.WriteLock writeLock )  {
        System.out.println(Thread.currentThread().getName()+"写文件获取锁等待中。。。");
        try{
            writeLock.lock();
            System.out.println(Thread.currentThread().getName()+"写文件中。。。");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+"写完成");
        }catch (Exception e){

        }finally {
            writeLock.unlock();
        }
    }
}

class MyTask implements  Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



