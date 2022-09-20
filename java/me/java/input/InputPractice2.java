package me.java.input;

import java.util.Scanner;

public class InputPractice2 {
    public static void main(String[] args) {

        int x,y = 0; //사용자에게 입력 받을 수
        int max,min = 0; //최대값, 최소값

        Scanner scanner = new Scanner(System.in);

        System.out.printf("첫번째 수 입력 >> ");
        x = scanner.nextInt();
        System.out.printf("두번째 수 입력 >> ");
        y = scanner.nextInt();

        if(x > y){
            max = x;
            min = y;
        }else{
            max = y;
            min = x;
        }

        System.out.printf("최대값 : %d, 최소값 : %d \n",max,min);

    }
}
