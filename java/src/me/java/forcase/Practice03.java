package me.java.forcase;

import java.util.Scanner;

/**
 * - 아래의 코드는 5명의 성적을 입력받아 합계와 평균을 구하는 프로그램이다.
 * - 성적 유효범위는 0 ≤ 성적 ≤ 100이라고 가정
 * - 성적 유효범위 이외의 데이터가 들어올 경우 `유효하지 않은 성적 입력값입니다`를 출력하시오.
 */
public class Practice03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM = 5;
        double sum = 0;
        double tmp = 0;
        double avg = 0;
        int cnt = 0;

        System.out.println("성적을 입력하세요.");
        for(int i = 0; i < NUM; i++) {
            System.out.printf(">>");
            tmp = sc.nextInt();
            if(tmp < 0 || tmp > 100){
                System.out.println("유효하지 않은 성적 입력값입니다.");
                break;
            }else{
                sum += tmp;
            }
            cnt++;
        }

        if(cnt >= 5){
            avg = sum / NUM;
            System.out.println("sum = " + sum);
            System.out.println("avg = " + avg);
        }

    }
}
