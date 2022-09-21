package me.java.ifcase;

import java.util.Scanner;

/**
 * 실습 3번
 */
public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x,y = 0;
        String operator = "";

        System.out.printf("정수1 입력 >> ");
        x = scanner.nextInt();
        System.out.printf("정수2 입력 >> ");
        y = scanner.nextInt();
        System.out.printf("연산자 입력(+,-,*,/,%%) >>");
        operator = scanner.next();

        switch (operator){
            case "+":
                System.out.println(x+" + "+y+" = "+(x+y));
                break;
            case "-":
                System.out.println(x+" - "+y+" = "+(x-y));
                break;
            case "*":
                System.out.println(x+" * "+y+" = "+(x*y));
                break;
            case "/":
                System.out.println(x+" / "+y+" = "+(x/y));
                break;
            case "%":
                System.out.println(x+" % "+y+" = "+(x%y));
                break;
            default:
                System.out.println("연산자가 유효하지 않습니다.");
        }
    }
}
