package me.java.forcase;

import java.util.Objects;
import java.util.Scanner;

/**
 * - 사용자에게 ‘q’라는 문자가 들어오기 전까지 입력받아 모든 문자를 하나의 문자열로 바꾸는 프로그램
 * - 입력되는 문자는 `알파벳, 숫자, 특수문자` 모두 가능
 */
public class Practice01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputStr = "";
        String totalStr = "";

        System.out.printf("문자를 입력하세요 >> ");
        while(true){
            inputStr = scanner.next();
            if(Objects.equals(inputStr, "q")) break;
            totalStr += inputStr;
        }

        System.out.println(totalStr);
    }
}
