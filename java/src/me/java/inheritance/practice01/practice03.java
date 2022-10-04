package me.java.inheritance.practice01;

import java.util.Arrays;

/**
 *  과제 2번 3번 출력 확인용
 */
public class practice03 {
    public static void main(String[] args) {
        Electronics electronics = new Electronics();

        Electronics[] groupByResults = electronics.groupByCompanyName();

        System.out.println(Arrays.toString(groupByResults[0].electronics));
        System.out.println(Arrays.toString(groupByResults[1].electronics));
        System.out.println(Arrays.toString(groupByResults[2].electronics));
    }
}
