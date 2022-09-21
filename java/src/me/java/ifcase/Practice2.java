package me.java.ifcase;

import java.util.Scanner;

/**
 * 실습 2번
 * 영문자 입력받고 대문자로 바꾸기
 */
public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = "";
        char alpha = 'a';

        System.out.printf("영문자를 입력해주세요 >> ");
        inputStr = scanner.next();
        alpha = inputStr.charAt(0);


        if(alpha >= 97 && alpha <= 122){ //소문자
            System.out.println((char)(alpha - 32));
        }else if(alpha >= 65 && alpha <= 90){
            System.out.println((char)alpha);
        }else{
            System.out.println("영문자가 유효하지 않습니다.");
        }


    }
}
