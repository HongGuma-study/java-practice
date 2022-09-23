package me.java.string;

import java.io.*;
import java.util.*;

public class Practice04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int inputNum1 = Integer.parseInt(st.nextToken());
        int inputNum2 = Integer.parseInt(st.nextToken());
        int reverseNum1 = 0;
        int reverseNum2 = 0;

        for(int i=2; i>=0; i--){
            reverseNum1 += ( (inputNum1 % 10) * Math.pow(10,i) );
            inputNum1 /= 10;
            reverseNum2 += ( (inputNum2%10)*Math.pow(10,i) );
            inputNum2 /= 10;
        }

        bw.write(String.valueOf(Math.max(reverseNum1, reverseNum2)));
        bw.flush();
        bw.close();
        br.close();
    }
}
