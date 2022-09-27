package me.java.arrays;

import java.io.*;

public class Practice05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //버퍼 입력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //버퍼 출력

        String inputStr = br.readLine().toLowerCase(); //string 입력 받기
        int[] counts = new int['z' - 'a' + 1]; // {0, 0, 0, 0 ... 0} 알파벳 개수만큼 배열 생성
        int max = counts[0]; //max값
        String answer = ""; //정답
        int cnt = 0; //중복 체크 하려고

        for (int i = 0; i < inputStr.length(); i++) {
            counts[inputStr.charAt(i)-'a']++;
        }

        for (int i=0; i<counts.length; i++) {
            if (counts[i] == 0) continue; // 0인 경우는 제외
//            bw.write((char)('a'+i)+" : "+String.valueOf(counts[i])+"\n"); //출력 확인용
            if (max < counts[i]) {
                max = counts[i];
                answer = String.valueOf((char) ('A' + i));
            }
        }

        // max값 중복 체크
        for(int count : counts){
            if(max == count) cnt++;
        }

        if(cnt > 1) answer = "?";

        bw.write(answer);

        bw.flush();
        bw.close();
        br.close();

    }
}
