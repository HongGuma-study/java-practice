package me.java.string;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //버퍼 입력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //버퍼 출력
        String inputStr = ""; // 입력 받은 문자열
        String outputStr = ""; // 출력할 문자열
        System.out.printf("채팅 메세지 입력 >>"); // 입력 유도 메세지
        inputStr = br.readLine().toUpperCase(); // 버퍼 입력 (입력받은 메세지를 바로 대문자로 변경함)

        String[] strArr = inputStr.split(" "); // 빈 공백을 기준으로 문자열을 나눈 것을 배열로 제공
        for(String s : strArr){ // strArr 배열에 있는 것을 하나씩 꺼내서 s에 대입한다.
            char tmp = s.charAt(0); // s에서 제일 첫 문자만 추출
            tmp += 32; // 32더하기 (ASCII 코드 상으로 A에 32를 더하면 a가 된다.)
            outputStr += (s.replaceFirst("[A-Z]",String.valueOf(tmp)) + " "); //맨 첫번째 자리의 문자와 소문자로 바꾼 문자의 자리를 바꾼다.
        }

        bw.write(outputStr); //버퍼 출력
        bw.flush();
        bw.close();
        br.close();

    }
}
