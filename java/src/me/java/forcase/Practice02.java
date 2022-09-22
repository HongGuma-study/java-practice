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

        String inputStr = "";
        String totalStr = "";
        String tmp = "";

        System.out.printf("문자를 입력하세요 >> ");
        while(true){
            inputStr = scanner.next();
            if(Objects.equals(inputStr, "q")) break;
            totalStr += inputStr;
        }

        for(int i=totalStr.length()-1; i>=0; i--){
            tmp += totalStr.charAt(i);
        }

        System.out.println(totalStr);
        System.out.println(tmp);
    }
}
