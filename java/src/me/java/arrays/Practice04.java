package me.java.arrays;

import java.io.*;

public class Practice04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //버퍼 입력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //버퍼 출력
        int repeat = Integer.parseInt(br.readLine()); //입력 받을 횟수

        for(int testcase=0 ; testcase<repeat; testcase++){ //테스트 케이스 입력 받은 만큼 반복한다.
            String inputStr = br.readLine(); //정답 입력 받기

            int score = 0, sum = 0; //맞은 문제의 점수, 총 합
            for(int i=0; i<inputStr.length(); i++){ //문자열 길이만큼 반복
                if(inputStr.charAt(i) == 'O'){ //문자열을 한자씩 자른다 자른 문자가 O인지
                    score++; // O 이면 ++1점
                    sum += score;
                }else{ // X 이면 0점으로 초기화
                    score = 0;
                }
            }

            bw.write(String.valueOf(sum));
            bw.write("\n");

        }

        bw.flush();
        bw.close();
        br.close();
    }
}
