package com.jh.movie.test;

import java.io.*;
import java.util.ArrayList;
import java.util.concurrent.locks.Lock;

public class readThread implements Runnable {
    private String path;
    private Lock lock;
    public readThread(String path, Lock lock) {
        this.path = path;
        this.lock = lock;
    }

    @Override
    public void run() {
        int i=0;
        try {
            while (i<20) {
                ArrayList<String> strings = readFromTextFile(this.path,this.lock);
                Thread.sleep(1000);
                System.out.println(strings);
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<String> readFromTextFile(String pathname,Lock lock) throws IOException {
        InputStreamReader reader=null;
        BufferedReader br=null;
        try {
            lock.lock();
            ArrayList<String> strArray = new ArrayList<String>();
            File filename = new File(pathname);
            reader = new InputStreamReader(new FileInputStream(filename));
            br = new BufferedReader(reader);
            String line = "";
            line = br.readLine();
            while (line != null) {
                strArray.add(line);
                line = br.readLine();
            }
            return strArray;
        }
        catch (Exception e){
            return null;
        }finally {
            lock.unlock();
            if(reader!=null){
                reader.close();
            }
            if(br!=null){
                br.close();
            }
        }
    }
}
