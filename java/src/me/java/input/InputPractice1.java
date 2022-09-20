package me.java.input;

import java.util.Scanner;

public class InputPractice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money, price = 0; //소비자가 낸 돈, 노트북 가격
        double change = 0; //거스름 돈
        double laptop = 0; //노트북 총액

        System.out.print("노트북 가격을 입력하세요 >> ");
        price = scanner.nextInt();
        if (price >= 0) {
            System.out.print("Sally가 낼 돈을 입력하세요 >> ");
            money = scanner.nextInt();
            if (money >= 0) {
                laptop = price + (price * 0.1);
                change = money - laptop;
                if (change > 0) {
                    System.out.printf("Sally가 받을 거스름 돈 : %.2f\n", change);
                } else {
                    System.out.printf("돈이 부족합니다! Sally가 더 내야할 돈 : %.2f\n", change * -1);
                }
            } else {
                System.out.println("Sally가 낼 돈은 음수가 될 수 없습니다.\n종료.");
            }
        } else {
            System.out.println("노트북 제품값은 음수가 될 수 없습니다.\n종료.");
        }


    }
}
