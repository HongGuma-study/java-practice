package me.java.string;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Practice03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String REGEX = "[a-zA-Z_]+"; // 정규 표현식 (알파벳만 입력 받음)
        int cnt = 0; // 단어 개수

        String inputStr = br.readLine();
        String[] strArr = inputStr.split(" "); //입력받은 문자열을 공백(" ") 기준으로 잘라서 배열로 만든다.

        for (String s : strArr) {
            if (Pattern.matches(REGEX, s)) cnt++; //패턴과 비교해서 알파벳이면 cnt 증가
        }

        bw.write(String.valueOf(cnt)); //cnt 는 int 임으로 string 으로 변경해서 출력
        bw.flush();
        bw.close();
        br.close();
    }
}
