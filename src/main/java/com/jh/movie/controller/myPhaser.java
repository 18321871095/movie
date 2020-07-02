package com.jh.movie.controller;

import java.util.concurrent.Phaser;

public class myPhaser extends Phaser {
    @Override
    protected boolean onAdvance(int phase, int registeredParties) {
        switch (phase){
            case 0:
                System.out.println("第一阶段完成哦！");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return  false;
            case 1:
                System.out.println("第二阶段完成哦！");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return  false;
            case 2:
                System.out.println("第三阶段完成哦！");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return  true;
            default:
                return true;
        }
    }
}
