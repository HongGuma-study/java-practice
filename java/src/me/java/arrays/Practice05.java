package me.java.arrays;

import java.io.*;

public class Practice05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //버퍼 입력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //버퍼 출력

        String inputStr = br.readLine().toLowerCase(); //string 입력 받기
        int[] counts = new int['z' - 'a' + 1]; // {0, 0, 0, 0 ... 0} 알파벳 개수만큼 배열 생성 (a == 0번째, b == 1번째, ...)
        int max = counts[0]; //max값
        String answer = ""; //정답
        int cnt = 0; //중복 체크 하려고

        for (int i = 0; i < inputStr.length(); i++) {
            counts[inputStr.charAt(i)-'a']++; // inputStr.charAt(i) == p 라면, p-a = 112-97 = 15, 15번째 0이 +1 된다.
        }

        for (int i=0; i<counts.length; i++) {
            if (counts[i] == 0) continue; // 0인 경우는 제외
//            bw.write((char)('a'+i)+" : "+String.valueOf(counts[i])+"\n"); //출력 확인용
            if (max < counts[i]) { //max값 찾기
                max = counts[i];
                answer = String.valueOf((char) ('A' + i)); // 'A' + max 배열 번호 ('p는 15번째에 저장되어 있고 'A' + 15 = 'P' 가 나온다.)
            }
        }

        // max값 중복 체크
        for(int count : counts){
            if(max == count) cnt++;
        }
        // cnt 가 1 이상이면 중복값이 있다는 뜻이므로 answer 는 ?가 된다.
        if(cnt > 1) answer = "?";

        bw.write(answer);

        bw.flush();
        bw.close();
        br.close();

    }
}
