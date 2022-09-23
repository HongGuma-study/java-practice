package me.java.string;

import java.io.*;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Practice06 {
    //디버깅용 코드
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //버퍼 입력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //버퍼 출력
        String REGEX = "[^a-z0-9]+"; //정규표현식 (a-z 문자를 제외한 전부)
        String inputStr = ""; // 입력 받은 문자열
        String reversStr; // 합친 문자열을 뒤집은 문자열

        inputStr = br.readLine().toLowerCase().replaceAll(REGEX,""); //입력받은 문자열에서 정규표현식에 해당하는 문자를 ""로 치환한다.
        StringBuffer sb = new StringBuffer(inputStr); //합친 문자열을 뒤집기 위해 선언한 string buffer
        reversStr = sb.reverse().toString(); //문자열 뒤집기

        bw.write(String.valueOf(reversStr.equals(inputStr))); // 뒤집은 문자열과 합친 문자열 일치하는지 비교한 결과 출력
        bw.flush();
        bw.close();
        br.close();
    }
    //실제로 사이트에 올린 코드
    public boolean isPalindrome(String s) {
        String REGEX = "[^a-z0-9]+";
        String inputStr = "";
        String reversStr;

        inputStr = s.toLowerCase().replaceAll(REGEX,"");
        StringBuffer sb = new StringBuffer(inputStr);
        reversStr = sb.reverse().toString();

        return reversStr.equals(inputStr);
    }
}
