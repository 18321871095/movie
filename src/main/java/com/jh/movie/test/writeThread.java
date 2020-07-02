package com.jh.movie.test;

import sun.rmi.runtime.RuntimeUtil;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.locks.Lock;

public class writeThread implements Runnable {
    private String path;
    private Lock lock;
    public writeThread(String path,Lock lock) {
        this.path = path;
        this.lock = lock;
    }
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+"开始写");
            writeFromTextFile(this.path,this.lock);
            System.out.println(Thread.currentThread().getName()+"写入成功");
        } catch (IOException e) {

        }
    }

    public static void writeFromTextFile(String pathname,Lock lock) throws IOException {
       // String content = Thread.currentThread().getName();
        FileWriter fileWriter=null;
        BufferedWriter bw=null;
        try {
            lock.lock();
            for(int i=1;i<=10;i++){
                fileWriter = new FileWriter(pathname,true);
                bw = new BufferedWriter(fileWriter);
                Thread.sleep(1000);
                bw.write(i+"");
                bw.close();
                fileWriter.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

}
