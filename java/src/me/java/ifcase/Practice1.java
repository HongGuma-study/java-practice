package me.java.ifcase;

import java.util.Scanner;

/**
 * 실습 1번
 */
public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float kr,math,en = 0;
        double arg = 0; //평균

        System.out.printf("국어 성적을 입력하세요 >> ");
        kr = scanner.nextFloat();
        System.out.printf("수학 성적을 입력하세요 >> ");
        math = scanner.nextFloat();
        System.out.printf("영어 성적을 입력하세요 >> ");
        en = scanner.nextFloat();

        if(kr < 0 || kr > 100 || math < 0 || math > 100 || en < 0 || en > 100){
            System.out.println("성적이 유효하지 않습니다.");
        }else{
            arg = (kr+math+en)/3;
            if(arg >= 70){
                System.out.println("합격");
            }else{
                System.out.println("평균 70 미만");
            }
        }




    }
}
