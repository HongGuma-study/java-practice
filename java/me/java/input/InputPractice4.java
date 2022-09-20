package me.java.input;

import java.util.Scanner;

public class InputPractice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;

        System.out.printf("숫자를 입력해주세요 >> ");
        num = scanner.nextInt();

        if(num > 0){
            System.out.println("양수");
        }else if(num < 0){
            System.out.println("음수");
        }else{
            System.out.println(0);
        }
    }
}
