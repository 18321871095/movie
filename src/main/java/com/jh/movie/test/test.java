package com.jh.movie.test;

import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class test {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");
        /*for(int i=0;i<strings.size();i++){
            if(strings.get(i).equals("3")){
                strings.remove(i);
            }
            System.out.println(i+":"+strings.get(i));
        }*/
        int a=0;
        for(String str:strings){
            if(a==2){
                strings.remove(str);
            }
            System.out.println(str);
            a++;
        }
    }
}
