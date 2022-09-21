package me.java.ifcase;

import java.util.Scanner;

/**
 * 실습 4번
 */
public class Practice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float x,y = 0;

        System.out.printf("x 입력>> ");
        x = scanner.nextFloat();
        System.out.printf("y 입력>> ");
        y = scanner.nextFloat();

        if(x > 0 && y > 0){
            System.out.println("1 사분면");
        }else if(x < 0 && y > 0){
            System.out.println("2 사분면");
        }else if(x < 0 && y < 0){
            System.out.println("3 사분면");
        }else if(x > 0 && y < 0){
            System.out.println("4 사분면");
        }else if(x == 0 && y != 0){
            System.out.println("y축 위에 있음");
        }else if(x != 0 && y == 0){
            System.out.println("x축 위에 있음");
        }
    }
}
