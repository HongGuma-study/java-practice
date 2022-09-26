package me.java.forcase;

import java.util.Objects;
import java.util.Scanner;

/**
 * - 실습 1번을 변경하여 하나의 문자열로 저장할 때 역순으로 저장하는 프로그램
 * - `reverse()` 함수 사용 금지
 */
public class Practice02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tmp = ""; //입력 받은 문자를 저장할 임시 변수
        String inputStr = ""; // 입력 받은 문자를 저장할 변수 (q 제외 하려고)
        String reverseStr = ""; // 역순 문자열을 저장할 변수

        System.out.printf("문자를 입력하세요 >> "); //입력 유도 메세지
        while(true){
            tmp = scanner.next(); //입력받음
            if(Objects.equals(tmp, "q")) break; //q를 입력 받으면 종료한다. (reverseStr에 저장하지 않음)
            inputStr += tmp; //현재까지 입력 받은 문자열 reverseStr에 저장
        }

        for(int i=inputStr.length()-1; i>=0; i--){ //inputStr 을 뒤에서부터 한자씩 추출함
            reverseStr += inputStr.charAt(i); //추출한 문자를 reverseStr에 저장
        }

    }
}
