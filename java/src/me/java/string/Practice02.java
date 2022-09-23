package me.java.string;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
 * 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
 *
 * QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
 */
public class Practice02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //버퍼 입력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //버퍼 출력
        StringTokenizer st; //string 토큰

        int testCase = Integer.parseInt(br.readLine()); //테스트 케이스 실행 횟수

        for(int i=0 ; i<testCase; i++){ //테스트 케이스 입력 받은 만큼 반복한다.
            st = new StringTokenizer(br.readLine());

            int repeatNum = Integer.parseInt(st.nextToken()); // 첫번째 입력 (문자를 반복할 횟수)
            String insertStr = st.nextToken(); // 두번째 입력 (반복할 문자열)
            String resultStr = ""; // 반복하고 난 후 출력할 문자열

            for(int j=0; j<insertStr.length(); j++){ // 입력 받은 문자열 길이 만큼 반복 (문자열을 하나씩 자를려고)
                for(int k=0; k<repeatNum; k++){ // 입력받은 반복 횟수만큼 반복 (ex 5 입력받으면 5번 반복)
                    resultStr += insertStr.charAt(j); // 입력 받은 문자열을 하나씩 잘라서 해당 횟수만큼 반복해서 resultStr 에 붙인다.
                }
            }

            bw.write(resultStr+"\n"); // 결과 출력
            bw.flush();

        }

        bw.close();
        br.close();
    }
}
