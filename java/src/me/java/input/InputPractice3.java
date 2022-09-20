package me.java.input;

import java.util.Scanner;

public class InputPractice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = 0;

        System.out.printf("년도를 입력해주세요>>");
        year = scanner.nextInt();

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("윤년");
                }else{
                    System.out.println("평년");
                }
            }else{
                System.out.println("윤년");
            }
        }else{
            System.out.println("평년");
        }

    }
}
