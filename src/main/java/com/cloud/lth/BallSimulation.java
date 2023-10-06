package com.cloud.lth;

import java.util.Random;

public class BallSimulation {
    public static void main(String[] args) {
        Random random = new Random();
        int redBalls =  random.nextInt(100)+1;
        int blueBalls = random.nextInt(100)+1;
        System.out.println("初始情况 - 红球数量：" + redBalls + "，蓝球数量：" + blueBalls);

        while (redBalls > 0 && blueBalls > 0) {
            int ball1 = new Random().nextInt(redBalls + blueBalls);
            int ball2 = new Random().nextInt(redBalls + blueBalls - 1);

            // 如果两个球数量都小于红色球的数量，或者都大于红色球的数量则认为颜色相同，相当于序号
            if ((ball1 < redBalls && ball2 < redBalls) || (ball1 >= redBalls && ball2 >= redBalls)) {
                redBalls += 2;
                blueBalls -= 2;
            }
            // 否则，两个球颜色不同，则换成蓝球
            else {
                redBalls--;
                blueBalls--;
            }
        }

        if (redBalls > 0) {
            System.out.println("最后箱子中剩下红球。");
        } else {
            System.out.println("最后箱子中剩下蓝球。");
        }
    }
}
