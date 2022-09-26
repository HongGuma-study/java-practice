package me.java.arrays;

import me.java.overview.Main;

import java.io.*;

public class Practice01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //버퍼 입력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //버퍼 출력
        final int STUDENT_NUM = 10;
        int[] scores = new int[STUDENT_NUM];
        int max,min,sum = 0; //최대, 최소
        double arg=0,variance=0,standard=0; //총합, 평균, 분산, 표준편차

        System.out.println("학생 성적 입력"); //입력 유도 메세지
        for(int i=0; i<10; i++){
            System.out.printf(">>");
            scores[i] = Integer.parseInt(br.readLine()); // \n 단위로 한줄씩 받기
        }
        max = scores[0];
        min = scores[0];
        for(int score : scores){
            if(max < score) max = score; //최대값 찾기 (max 보다 score 의 값이 크다면 score 의 값이 최대가 된다.
            if(min > score) min = score; //최소값 찾기 (min 보다 score 의 값이 작다면 score 가 최소값이 된다.
            sum += score; //총합 구하기
        }
        arg = sum/10; //평균 구하기

        for(int score : scores){
            variance += Math.pow((score - arg),2); // score-평균 값을 제곱한후 더한다.
        }
        variance /= 10; //분산
        standard = Math.sqrt(variance); //표준편차
        bw.write("최대값:"+String.valueOf(max)+", ");
        bw.write("최소값:"+String.valueOf(min)+", ");
        bw.write("평균:"+String.valueOf(arg)+", ");
        bw.write("분산:"+String.valueOf(variance)+", ");
        bw.write("표준편차:"+String.valueOf(standard));
        bw.flush();
        bw.close();
        br.close();
    }

}
